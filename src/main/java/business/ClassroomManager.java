package business;

import persistence.repository.IClassroomDBRepository;

import javax.inject.Inject;

public class ClassroomManager {

    @Inject
    IClassroomDBRepository repo;

    public String addClassroom(String classroom){
        return repo.addClassroom(classroom);
    }

    public String deleteClassroom(int id){
        return repo.deleteClassroom(id);
    }

    public String editClassroom(String classroom){
        return repo.editClassroom(classroom);
    }

    public String getAllClassrooms(){
        return repo.getAllClassrooms();
    }

    public String getClassroomById(int id){
        return repo.getClassroomById(id);
    }


}
