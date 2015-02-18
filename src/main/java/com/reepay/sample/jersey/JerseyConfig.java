package com.reepay.sample.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/v1")
public class JerseyConfig extends ResourceConfig {
    
    public JerseyConfig() {
        packages("com.reepay.sample.jersey.resource");
    }
    
}
