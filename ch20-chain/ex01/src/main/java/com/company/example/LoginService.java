package com.company.example;

// tag::source[]
public class LoginService {
    private IAuthenticator authenticator;

    public LoginService(IAuthenticator authenticator) {
        this.authenticator = authenticator;
    }
    public Response login(String username, String password) {
        Request request = new Request();
        request.setUsername(username);
        request.setPassword(password);
        return authenticator.authenticate(request);
    }
}
// end::source[]