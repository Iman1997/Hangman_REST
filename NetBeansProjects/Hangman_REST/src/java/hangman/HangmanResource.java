/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

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
     * Retrieves representation of an instance of hangman.HangmanResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("HelloWorld")
    @Produces("text/html")
    public String getHtml() {
        return "<html><body><h1>Hello, World!!</body></h1></html>";
    }


    /**
     * PUT method for updating or creating an instance of HangmanResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}
