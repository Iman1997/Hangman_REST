/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hangman_REST;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Path;


/**
 *
 * @author bruger
 */
@Path("Json")
class Json {
    String bruger = "{ key1: 'value1', key2: 'value2' }";
    private List<Point> point;
    class Point
               {
                   private int i=1;
               }
               public Json() {
                   point = new ArrayList<>();
                   point.add(new Point());
               }
               Json j = new Json();
               Gson g = new Gson();
               String json =g.toJson(j);
            
}
