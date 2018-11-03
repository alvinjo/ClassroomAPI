package persistence.repository;

import javax.persistence.EntityManager;

public class ClassroomDBRepository implements IClassroomDBRepository{

    EntityManager manager;

    @Override
    public String addClassroom(String classroom) {
        return null;
    }

    @Override
    public String deleteClassroom(int id) {
        return null;
    }

    @Override
    public String editClassroom(String classroom) {
        return null;
    }

    @Override
    public String getAllClassrooms() {
        return null;
    }

    @Override
    public String getClassroomById(int id) {
        return null;
    }
}
