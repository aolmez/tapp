package com.refPob;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        TClass tClass = new TClass();
        var message = tClass.get();
        return "Hello from Quarkus REST";
    }
}
