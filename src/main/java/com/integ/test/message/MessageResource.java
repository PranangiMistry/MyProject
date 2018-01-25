package com.integ.test.message;

/**
 * Author: mpanchal
 * Date: 1/19/18 12:32 PM
 */

import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("message")
public class MessageResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessages(){
        return "Hello from MessageResource";
    }
}
