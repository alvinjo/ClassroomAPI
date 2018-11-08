package persistence.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Classroom {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classroomId;
    private String trainer;
    private static int classroomIDCount = 1;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "classroomId")
    private List<Trainee> trainees = new ArrayList<>();


    public Classroom(){
    }


    private int generateClassRoomID(){
        return classroomIDCount++;
    }

    public int getClassroomId(){
        return classroomId;
    }

    public String getTrainer(){
        return trainer;
    }

    public void setTrainer(String trainer){
        this.trainer = trainer;
    }

    public List getTrainees(){
        return trainees;
    }

    public void setTrainees(List trainees){
        this.trainees = trainees;
    }

}
