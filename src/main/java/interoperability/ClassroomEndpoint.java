package interoperability;

import business.ClassroomManager;

import javax.inject.Inject;
import javax.ws.rs.*;

@Path("/classroom")
public class ClassroomEndpoint {

    @Inject
    ClassroomManager manager;

    @GET
    @Produces({"application/json"})
    @Path("/getAllClassrooms")
    public String getAllClassrooms(){
        return manager.getAllClassrooms();
    }


    @GET
    @Produces({"application/json"})
    @Path("/getClassroomById/{id}")
    public String getClassroomById(@PathParam("id") int id){
        return manager.getClassroomById(id);
    }


    @POST
    @Produces({"application/json"})
    @Path("/addClassroom")
    public String addClassroom(String classroom){
        return manager.addClassroom(classroom);
    }



    @GET
    @Produces({"application/json"})
    @Path("/getClassroomById/{id}")
    public String test(){
        return "test";
    }

}
