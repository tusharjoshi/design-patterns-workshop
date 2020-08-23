package com.company.example;

// tag::source[]
public abstract class AbstractAuthenticator implements IAuthenticator {
    private IAuthenticator nextAuthenticator;

    public IAuthenticator setNext(IAuthenticator authenticator) {
        nextAuthenticator = authenticator;
        return authenticator;
    }

    public Response authenticate(Request request) {
        if( nextAuthenticator != null ) {
            return nextAuthenticator.authenticate(request);
        }

        return null;
    }
}
// end::source[]