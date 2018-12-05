package pl.pszczupak.javaee.zad05.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pl.pszczupak.javaee.zad05.domain.Motocykl;
import pl.pszczupak.javaee.zad05.service.MotocyklManager;

@Path("Motocykl")
@Stateless
public class MotocyklRESTService {

    @Inject
    private MotocyklManager mm;

    @GET
    @Path("/{motocyklId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Motocykl getMotocykl(@PathParam("motocyklId") Integer id) {
        Motocykl m = mm.getMotocykl(id);
        return m;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Motocykl> getMotocykle() {
        return mm.getAllMotocykl();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addMotocykl(Motocykl motocykl) {
        mm.addMotocykl(motocykl);

        return Response.status(201).entity("Motocykl pozytwnie utworzony.").build();
    }

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "This is working MotocyklRESTService";
    }

    @DELETE
    public Response clearMotocykle() {
        mm.deleteAllMotocykl();
        return Response.status(200).entity("Wszystkie Motocykle usunieto pomyslnie.").build();
    }

}
