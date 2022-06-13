package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NonNull
@NoArgsConstructor
@ToString(callSuper = true)

public class GroupList {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private boolean openGroup = true;
    @OneToMany(mappedBy = "groupList", cascade = CascadeType.PERSIST)
    private final List<Alphinist> alpinists = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "mountain_iid")
    private Mountain mountain;


    public GroupList(Mountain mountain) {
        this.mountain = mountain;
    }

    ////
    public  void  addAlpinist(Alphinist... alp){
        if (!openGroup){
            System.out.println("мест нет");
            return;
        }
        for (Alphinist alphinist : alp) {
            if (alpinists.size() < 3) {
                alphinist.setGroupList(this);
                alpinists.add(alphinist);
            }
            if (alpinists.size() == 3){
                openGroup = false;
                System.out.println("Места закончились");
            }
        }
    }
}