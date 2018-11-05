/*
package persistence.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ClassroomDBRepositoryTest {
    @Mock
//    EntityManager em;
    ClassroomDBRepository repo;

    String jsonClassroom;

    @Before
    public void setup(){
        this.repo.manager = mock(EntityManager.class);
        this.jsonClassroom = "{\"classroomID\": 1, \"trainer\": \"John Gordon\", " +
                "\"trainees\": [{\"traineeID\": 1, \"traineeName\": \"Joe Bloggs\"}]}";
    }

    @Test
    public void addClassroomTest() {

        String actual = repo.addClassroom(jsonClassroom);
        String expected = "{\"message\": \"classroom added\"}";
        when(actual).thenReturn(expected);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteClassroomTest() {
        repo.addClassroom(jsonClassroom);
        String actual = repo.deleteClassroom(1);
        String expected = "{\"message\":\"classroom deleted\"}";
        when(actual).thenReturn(expected);
        Assert.assertEquals(expected, actual);

        actual = repo.getClassroomById(1);
        expected = "{\"message\": \"classroom not found\"}";
        when(actual).thenReturn(expected);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void editClassroomTest() {
        repo.addClassroom(jsonClassroom);
        String edited = "{\"classroomID\": 1, \"trainer\": \"Gohn Jordon\", " +
                "\"trainees\": [{\"traineeID\": 1, \"traineeName\": \"Boe Jloggs\"}]}";
        String expected = "{\"message\": \"classroom updated\"}";
        String actual = repo.editClassroom(edited);
        when(actual).thenReturn(expected);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllClassroomsTest() {
        repo.addClassroom(jsonClassroom);
        String actual = repo.getAllClassrooms();
        String expected = "{\"classroomID\": 1, \"trainer\": \"John Gordon\", " +
                "\"trainees\": [{\"traineeID\": 1, \"traineeName\": \"Joe Bloggs\"}]}";
        when(actual).thenReturn(expected);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getClassroomByIdTest() {
        repo.addClassroom(jsonClassroom);
        String actual = repo.getClassroomById(1);
        String expected = "{\"classroomID\": 1, \"trainer\": \"John Gordon\", " +
                "\"trainees\": [{\"traineeID\": 1, \"traineeName\": \"Joe Bloggs\"}]}";
        when(actual).thenReturn(expected);
        Assert.assertEquals(expected, actual);
    }
}
*/
