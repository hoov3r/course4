package entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@NonNull
@NoArgsConstructor

public class Groups {
    private String groupName;
    private boolean openGroup;
    private Alphinist[] alphinists;

    private Mountain mountain;

    public  Groups (boolean openGroup, Mountain mountain, Alphinist[] alphinists){
        setOpenGroup(openGroup);
        setMountain(mountain);
        setAlphinists(alphinists);
    }
    ////
    public  void  addAlphinist(Alphinist alphinist){
        if (!openGroup){
            System.out.println("мест нет");
        } else {
            for (int i = 0; i < alphinists.length; i++){
                if (alphinists[i] == null){
                    alphinists[i] = alphinist;
                    return;
                }
            }
            System.out.println("Набор в группу окончен");
            openGroup = false;
        }
    }

    public  void addAlpinists(Alphinist...alphinists){
        for(Alphinist alphinist: alphinists){
            addAlpinists(alphinists);
        }
    }
}
