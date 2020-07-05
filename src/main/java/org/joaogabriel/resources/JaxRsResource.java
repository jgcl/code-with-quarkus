package org.joaogabriel.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jaxrs")
public class JaxRsResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "ola jaxrs";
    }

}