package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path(value = "/hello")
public class HelloService {

	@GET
	@Path("/{param}")
	public Response getMessage(@PathParam("param") String msg){
		String output = "Jersey says: " + msg;
		return Response.status(200).entity(output).build();
	}
	
}
