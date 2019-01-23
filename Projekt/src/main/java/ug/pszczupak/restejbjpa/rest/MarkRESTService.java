package ug.pszczupak.restejbjpa.rest;

import ug.pszczupak.restejbjpa.domain.Mark;
import ug.pszczupak.restejbjpa.service.MarkManager;


import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("mark")
@Stateless
public class MarkRESTService {

	@Inject
	private MarkManager mm;	
	
	@GET
	@Path("/{markId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Mark getMark(@PathParam("markId") long id) {
		return mm.getMark(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Mark> getMarks() {
		return mm.getAllMarks();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addMark(Mark mark) {
		mm.addMark(mark);
		return Response.status(Response.Status.CREATED).entity("Mark").build();
	}

	@PUT
	@Path("/{markId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Mark updateMarka(@PathParam("markId") long id, Mark mark) {
		return mm.updateMark(mark, id);
	}


	@DELETE
	public Response clearMarks() {
		mm.deleteAllMarks();
		return Response.status(Response.Status.OK).build();
	}

	@DELETE
	@Path("/{markId}")
	public Response deleteManufacturer(@PathParam("markId") long id) {
		mm.deleteMark(id);
		return Response.status(200).build();
	}

	
	
	
}
