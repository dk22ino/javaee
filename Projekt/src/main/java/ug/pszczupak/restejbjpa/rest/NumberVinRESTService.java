package ug.pszczupak.restejbjpa.rest;

import ug.pszczupak.restejbjpa.domain.NumberVin;
import ug.pszczupak.restejbjpa.service.NumberVinManager;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("number-vin")
@Stateless
public class NumberVinRESTService {

	@Inject
	private NumberVinManager nvm;

	@GET
	@Path("/{numberVinId}")
	@Produces(MediaType.APPLICATION_JSON)
	public NumberVin getVin(@PathParam("numberVinId") long id) {
		return nvm.getNumberVin(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<NumberVin> getNumerVin() {
		return nvm.getAllNumberVin();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addNumerVin(NumberVin numer) {
		nvm.addNumberVin(numer);
		return Response.status(Response.Status.CREATED).entity("NumberVin").build();
	}

	@PUT
	@Path("/{numberVinId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public NumberVin updateNumerVin(@PathParam("numberVinId") long id, NumberVin numer) {
		return nvm.updateNumberVin(numer, id);
	}


	@DELETE
	public Response clearNumerVin() {
		nvm.deleteAllNumberVin();
		return Response.status(Response.Status.OK).build();
	}

	@DELETE
	@Path("/{numberVinId}")
	public Response deleteNumerVin(@PathParam("numberVinId") long id) {
		nvm.deleteNumberVin(id);
		return Response.status(200).build();
	}
		
	
	
}
