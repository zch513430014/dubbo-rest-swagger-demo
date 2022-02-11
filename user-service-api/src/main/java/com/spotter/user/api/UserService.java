package com.spotter.user.api;


import com.spotter.user.api.model.UserModel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Path("/user-service/test")
public interface UserService {

    @GET
    @Path("/getUserName")
    String getUserName();
}
