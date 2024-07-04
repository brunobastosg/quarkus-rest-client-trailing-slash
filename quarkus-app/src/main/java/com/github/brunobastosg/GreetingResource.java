package com.github.brunobastosg;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/hello")
public class GreetingResource {

    @RestClient
    RemoteService remoteService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return remoteService.callService();
    }
}
