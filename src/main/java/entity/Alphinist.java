package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.*;

@EqualsAndHashCode(callSuper = false)
@Entity
@Getter
@Setter
@ToString(callSuper = true)
@NonNull
@RequiredArgsConstructor

public class Alphinist {

    public Alphinist(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    @Column(unique = true)
    private String name;
    private String adress;

    @ManyToOne(fetch = FetchType.EAGER)
    @Setter
    private GroupList groupList;
}
