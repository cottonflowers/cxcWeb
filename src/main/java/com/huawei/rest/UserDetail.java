package com.huawei.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.huawei.dao.UserDao;
import com.huawei.domain.User;

@Controller
@Path("rest/user")
@Produces("text/plain; charset=utf-8")
public class UserDetail {
	@Autowired
	UserDao dao;

	@GET
	@Path("/{param}")
	public Response getUsers(@PathParam("param") String userId) {
		String userIdArray[] = userId.split(",");
		List<String> userList = new ArrayList<String>();
		for (String item : userIdArray) {
			User userTemp = dao.getUserById(Integer.parseInt(item));
			if (userTemp != null) {
				String userString = userTemp.toString();
				userList.add(userString);
			}
		}
		return Response.ok(userList).build();
	}
}
