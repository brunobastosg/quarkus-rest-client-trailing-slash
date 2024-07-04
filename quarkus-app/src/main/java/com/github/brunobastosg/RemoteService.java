package com.github.brunobastosg;

import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;

@Path("/endpoint-with-trailing-slash/")
@RegisterRestClient(configKey = "remote-service")
public interface RemoteService {

    @GET
    String callService();
}
