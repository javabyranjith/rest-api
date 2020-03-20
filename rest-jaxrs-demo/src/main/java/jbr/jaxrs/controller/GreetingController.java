package jbr.jaxrs.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/greeting")
public class GreetingController {

  @GET
  @Path("/morning")
  public Response morning() {
    return Response.ok()
        .entity("GOOD MORNING!!!")
        .build();
  }

  @GET
  @Path("/evening")
  public Response evening() {
    return Response.ok()
        .entity("GOOD EVENING!!!")
        .build();
  }

}
