package com.reepay.sample.jersey.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value = "home", description = "demo api")
@Component
@Path("/ping")
public class PingResource {
    
    @ApiOperation(value = "Make a ping", notes = "Returns pong", response = String.class)
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "pong";
    }

}
