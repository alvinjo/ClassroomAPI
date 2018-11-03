package persistence.repository;

public interface IClassroomDBRepository {


    String addClassroom(String classroom);

    String deleteClassroom(int id);

    String editClassroom(String classroom);

    String getAllClassrooms();

    String getClassroomById(int id);
}
