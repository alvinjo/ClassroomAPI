package persistence.domain;

import javax.persistence.*;

@Entity
public class Trainee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private int classroomId;


    public Trainee() {

    }

    public Trainee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return Id;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getClassroomId(){
        return classroomId;
    }

    public void setClassroomId(int id){
        this.classroomId = id;
    }

}
