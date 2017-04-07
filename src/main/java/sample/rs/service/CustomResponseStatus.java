/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.rs.service;

import javax.ws.rs.core.Response;

/**
 *
 * @author slavb
 */
public class CustomResponseStatus implements Response.StatusType {
    
    private final int statusCode;

    private final String reasonPhrase;

    public CustomResponseStatus(int statusCode, String reasonPhrase) {
        this.statusCode = statusCode;
        this.reasonPhrase = reasonPhrase;
    }

    @Override
    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public Response.Status.Family getFamily() {
        return Response.Status.Family.familyOf(statusCode);
    }

    @Override
    public String getReasonPhrase() {
        return reasonPhrase;
    }

}
