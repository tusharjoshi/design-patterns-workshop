package com.company.example;

// tag::source[]
public class NoUserAuthenticator extends AbstractAuthenticator {
    public Response authenticate(Request request) {
        Response response = new Response();
        response.setResult("FAILURE");
        response.setMessage("No User Found.");
        return response;
    }
}
// end::source[]