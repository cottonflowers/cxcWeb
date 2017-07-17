package com.huawei.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.huawei.dao.UserDao;

@Controller
@Path("/user")
public class UserDetail {
    @Autowired
    UserDao dao;
    
	@GET
    @Path("/id{param}")
    public String getBooks(@PathParam("param") int userId) {
		String user = dao.getUserById(userId).toString();
		return user;
    }
}
