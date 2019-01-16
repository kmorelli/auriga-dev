package br.gunvegas.auriga.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/teste")
public class RestTeste {
	
	@GET
	@Path("/gets")
	@Produces(MediaType.TEXT_HTML)
	public Response testeGetSimples() {
		ResponseBuilder resbuild = Response.ok("Retorno resposta OK");
		return resbuild.build();
	}

	@GET
	@Path("/getn")
	public Response testeGetNoContent() {
		ResponseBuilder resbuild = Response.noContent();
		return resbuild.build();
	}	
	
}
