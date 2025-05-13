package com.pascal.kafka.connect.rest.extension.rest;

import com.pascal.kafka.connect.rest.extension.model.Info;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/info")
@Produces(MediaType.APPLICATION_JSON)
public class RestResource {

  public RestResource() {}

  @GET
  public Response info() {
    return Response.status(200).entity(new Info()).build();
  }
}
