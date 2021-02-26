package nl.whl.dea.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/health")
public class HealthCheckResource {

    @GET
    public String healthy() {
        return "Up & Running";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getItemsInJson(){
        return Response.ok("[\"bread\", \"butter\"]").build();
    }
}