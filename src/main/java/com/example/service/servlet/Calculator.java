package com.example.service.servlet;

import com.example.service.http.utils.httpResult.CommonHttpResult;
import com.example.service.http.utils.log.Log;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1")
public class Calculator {
    private static final String TAG = "Calculator";

    public Calculator() {
    }

    @GET
    @Path("/APlusB")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public CommonHttpResult<Integer> aPlusB(@QueryParam("a") int a, @QueryParam("b") int b) {
        int result = a + b;
        Log.d(TAG, String.format("a: %s, b: %s, result: %s + %s = %s", a, b, a, b, result));
        return new CommonHttpResult<Integer>(0, result);
    }

    @GET
    @Path("/AMinusB")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public CommonHttpResult<Integer> aMinusB(@QueryParam("a") int a, @QueryParam("b") int b) {
        int result = a - b;
        Log.d(TAG, String.format("a: %s, b: %s, result: %s - %s = %s", a, b, a, b, result));
        return new CommonHttpResult<Integer>(0, result);
    }

}
