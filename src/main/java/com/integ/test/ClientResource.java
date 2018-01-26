package com.integ.test;

import com.integ.test.api.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Author: mpanchal
 * Date: 1/25/18 1:55 PM
 */
@Path("client")
public class ClientResource {

        ClientService cs=new ClientService();

        @POST
        @Consumes(MediaType.APPLICATION_JSON)
        @Produces(MediaType.TEXT_PLAIN)
        public String displayClient(Client client)
        {
            System.out.println("cr");
            System.out.println(client);
              //return client;
            int responce=cs.insertDetail(client);
            if(responce==0)
            {
                System.out.println("fail");
                return "fail";
            }
            else
            {
                System.out.println("suc");
                return "success";
            }
        }

//        @POST
//        @Path("/user")
//        @Consumes(MediaType.APPLICATION_JSON)
//        @Produces(MediaType.APPLICATION_JSON)
//        public  User userdetail(User user){
//            System.out.println(user);
//            return  user;
//        }
//

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public List<Client> retriveDeatils()
        {
            return cs.retriveDeatils();
        }

}
