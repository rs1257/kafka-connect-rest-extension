package com.pascal.kafka.connect.rest.extension.rest;

import com.pascal.kafka.connect.rest.extension.model.Info;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/info")
@Produces(MediaType.APPLICATION_JSON)
public class RestResource {

  public RestResource() {}

  @GET
  public Response info() {
    return Response.status(200).entity(new Info()).build();
  }
}
