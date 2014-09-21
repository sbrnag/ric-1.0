package com.ric.rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ric.mongodb.dao.AbstractDAO;
import com.ric.mongodb.dao.UsersDAO;

@Path("/")
public class LoginResource {
	
	private AbstractDAO usersdao = new UsersDAO();
	
	public void setUsersdao(AbstractDAO usersdao) {
		this.usersdao = usersdao;
	}

	/**
     * Method handling HTTP GET requests to check the app is live or not. 
     *
     * @return String that will be returned as a text/plain response telling app is alive.
     */
    @POST()
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/signup")
    public String signUp(String user) {
    	
    	String str = usersdao.save(user);
    	
        return str;
    }
}
