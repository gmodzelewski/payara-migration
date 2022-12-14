package org.acme;

import org.acme.filter.annotations.TracedEndpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldEndpoint {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @TracedEndpoint
    public String helloWorld() {
        return "Hello World!";
    }
}
