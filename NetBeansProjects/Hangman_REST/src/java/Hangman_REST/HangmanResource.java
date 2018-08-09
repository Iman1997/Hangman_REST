/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hangman_REST;

import brugerautorisation.data.Bruger;
import brugerautorisation.data.Diverse;
import brugerautorisation.data.UserData;
import brugerautorisation.transport.rmi.Brugeradmin;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * REST Web Service
 *
 * @author bruger
 */
@Path("Hangman")
public class HangmanResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HangmanResource
     */
    public HangmanResource() {
    }

    /**
     * Retrieves representation of an instance of Hangman_REST.HangmanResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("HelloWorld")
    @Produces("text/html")
    public String getHtml() {
        return "<html><body><h1>Hello, World!!</h1></body></html>";
    }
    /**
     * PUT method for updating or creating an instance of HangmanResource
     * @param content representation for the resource
     */
    @POST
    @Path("Login")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login (UserData data) throws RemoteException {
        Brugeradmin ba;
        Bruger b;
        String loginData = null;
           
        try {
            ba = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");
            b = ba.hentBruger(data.getUsername(), data.getPassword());

            loginData = "User: " + b + ", " + "Data: " + Diverse.toString(b);

        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(HangmanResource.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(loginData);
        return Response.status(Status.ACCEPTED).build();
    }
    
}
