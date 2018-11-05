package persistence.repository;

import persistence.domain.Classroom;
import util.JSONUtil;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import java.util.Collection;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBRepository implements IClassroomDBRepository{

    @PersistenceContext(unitName = "primary")
    EntityManager manager;

    @Inject
    JSONUtil jUtil;

    @Transactional(REQUIRED)
    @Override
    public String addClassroom(String classroom) {
        Classroom newClassroom = jUtil.jsonToObj(classroom, Classroom.class);
        if(newClassroom == null){
            return "its null";
        }
        manager.persist(newClassroom);
        return "{\"message\":\"classroom added\"}";
    }

    @Transactional(REQUIRED)
    @Override
    public String deleteClassroom(int id) {
        Classroom searchClass = findClassroom(id);
        if(searchClass == null){
            return "{\"message\": \"classroom not found\"}";
        }
        manager.remove(findClassroom(id));
        return "{\"message\":\"classroom deleted\"}";
    }

    @Transactional(REQUIRED)
    @Override
    public String editClassroom(String classroom) {
        Classroom editedClass = jUtil.jsonToObj(classroom, Classroom.class);
        Classroom dbClass = findClassroom(editedClass.getClassroomId());
        dbClass.setTrainer(editedClass.getTrainer());

        return "{\"message\": \"classroom updated\"}";
    }

    @Override
    public String getAllClassrooms() {
        Query query = manager.createQuery("select c from Classroom c");
        Collection<Classroom> classroomColl = query.getResultList();

        return jUtil.objToJson(classroomColl);
    }

    @Override
    public String getClassroomById(int id) {
        return jUtil.objToJson(findClassroom(id));
    }


    public Classroom findClassroom(int id){
        return manager.find(Classroom.class, id);
    }

}
