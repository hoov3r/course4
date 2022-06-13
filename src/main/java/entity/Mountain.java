package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

@ToString(callSuper = true)
@Entity
@Getter
@Setter
@NonNull
@NoArgsConstructor

public class Mountain {
    public Mountain(String mName, String country, int high) {
        this.mName = mName;
        this.country = country;
        this.high = high;
    }

    @Column(unique = true)
    private String mName;
    private String country;
    private int high;


    @OneToOne
    @JoinColumn(name = "group_list_iid")
    private GroupList groupList;
}
