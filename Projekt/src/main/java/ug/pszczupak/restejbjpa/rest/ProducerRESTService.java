package ug.pszczupak.restejbjpa.rest;

import ug.pszczupak.restejbjpa.domain.Producer;
import ug.pszczupak.restejbjpa.service.ProducerManager;


import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("producer")
@Stateless
public class ProducerRESTService {

	@Inject
	private ProducerManager pm;	
	
	@GET
	@Path("/{producerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Producer getProducer(@PathParam("producerId") long id) {
		return pm.getProducer(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Producer> getProducers() {
		return pm.getAllProducers();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addProducer(Producer producer) {
		pm.addProducer(producer);
		return Response.status(Response.Status.CREATED).entity("Producer").build();
	}

	@PUT
	@Path("/{producerId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Producer updateProducer(@PathParam("producerId") long id, Producer producer) {
		return pm.updateProducer(producer, id);
	}


	@DELETE
	public Response clearProducers() {
		pm.deleteAllProducers();
		return Response.status(Response.Status.OK).build();
	}

	@DELETE
	@Path("/{producerId}")
	public Response deleteProducer(@PathParam("producerId") long id) {
		pm.deleteProducer(id);
		return Response.status(200).build();
	}

	
	
	
}
