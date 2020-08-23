package com.company.example;

// tag::source[]
public interface IAuthenticator {
    IAuthenticator setNext(IAuthenticator authenticator);
    Response authenticate(Request request);
}
// end::source[]