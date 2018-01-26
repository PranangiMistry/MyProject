package com.integ.test;

/*
* Author: Manan
* Date: 18-01-2018 13:48
*/

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.integ.test.api.HelloApi;
import com.integ.test.message.MessageResource;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("webapp")
public class JerseyApp extends ResourceConfig {

    public JerseyApp() {
        register(HelloApi.class);
        register(MessageResource.class);
        register(ClientResource.class);
        register(new JacksonJsonProvider());
    }
}
