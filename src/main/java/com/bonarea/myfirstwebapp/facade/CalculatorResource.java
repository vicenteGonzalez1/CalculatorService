/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.myfirstwebapp.facade;
/*
import com.bonarea.myfirstwebapp.calculadora.Operation;
import static com.bonarea.myfirstwebapp.calculadora.OperationNameLiteral;
import com.google.gson.Gson;*/
import com.google.gson.JsonObject;
/*
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;*/
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author alumne
 */
@Path("calculator")
public class CalculatorResource {

    @Context
    private UriInfo context;
/*
    @Inject
    @Any
    Instance<Operation> operation;
*/
    /**
     * Creates a new instance of CalculatorResource
     */
    public CalculatorResource() {
    }
    
    @GET
    @Path("suma/{num1}/{num2}")
    public Response getSuma(@PathParam("num1") int num1, @PathParam("num2") int num2) {
        int output = num2 + num1;
        JsonObject object = new JsonObject();
        object.addProperty("resultado", output);
        return Response.status(200).entity(object.toString()).build();
    }
/* //NO funciona
    @GET
    @Path("{operacion}/{num1}/{num2}")
    public Response getOperacion(@PathParam("operacion") String operacion,
            @PathParam("num1") int num1, @PathParam("num2") int num2) {

        final OperationNameLiteral calculatorNameLiteral
                = new OperationNameLiteral(operacion);

        final Operation operationSelected
                = operation.select(calculatorNameLiteral).get();

        int resultado = operationSelected.calculate(num1, num2);

        JsonObject object = new JsonObject();
        object.addProperty("resultado", resultado);
        return Response.status(200).entity(object.toString()).build();
    }*/

    /**
     * Retrieves representation of an instance of
     * com.bonarea.myfirstwebapp.facade.CalculatorResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        return "ESTO ES UNA PRUBA";
    }

    /**
     * PUT method for updating or creating an instance of CalculatorResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
