/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restgalgeleg;

import brugerautorisation.transport.rmi.Brugeradmin;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Iman
 */
@Path("/restgalgeleg")
public class RestGalgeleg {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestGalgeleg
     */
    public RestGalgeleg() {
    }

    /**
     * Retrieves representation of an instance of restgalgeleg.RestGalgeleg
     * @return an instance of java.lang.String
     */
    @Path("/returnhelloworld")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        return "<html><body><h1>Hello, World!!</body></h1></html>";
       
    }

    /**
     * PUT method for updating or creating an instance of RestGalgeleg
     * @param content representation for the resource
     */
    @Path("/test")
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
    
    /*@Path("/login")
    @GET
    //@Consumes(MediaType.APPLICATION_JSON)
    public void putHtml (UserData data) throws NotBoundException, MalformedURLException, RemoteException {
        Brugeradmin ba = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");
        ba.hentBruger("s165228", "s165228");
         
    }*/
}
