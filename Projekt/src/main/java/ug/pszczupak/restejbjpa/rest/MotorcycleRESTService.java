package ug.pszczupak.restejbjpa.rest;

import ug.pszczupak.restejbjpa.domain.Motorcycle;
import ug.pszczupak.restejbjpa.domain.Person;
import ug.pszczupak.restejbjpa.service.MotorcycleManager;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("motorcycle")
@Stateless
public class MotorcycleRESTService {
	@Inject
	private MotorcycleManager mm;
	
	@GET
	@Path("/{motorcycleId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Motorcycle getMotorcycle(@PathParam("motorcycleId") long id) {
		return mm.getMotorcycle(id);
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Motorcycle> getMotorcycle() {
		return mm.getAllMotorcycle();
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addMotocykl(Motorcycle motor) {
		mm.addMotorcycle(motor);
		return Response.status(Response.Status.CREATED).entity("Motorcycle").build();
	}
	
	@PUT
	@Path("/{motorcyclelId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Motorcycle updateMotorcycle(@PathParam("motorcycleId") long id, Motorcycle motor) {
		return mm.updateMotorcycle(motor, id);
	}
	
	
	@DELETE
	public Response clearMotorcycle() {
		mm.deleteAllMotorcycle();
		return Response.status(Response.Status.OK).build();
	}

	@DELETE
	@Path("/{motorId}")
	public Response deleteMotocykl(@PathParam("motorlId") long id) {
		mm.deleteMotorcycle(id);
		return Response.status(200).build();
	}
	
	
}
