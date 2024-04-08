package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class LoginServiceTest {

    private LoginService target;

    @BeforeEach
    public void beforeEach() {
        IAuthenticator authenticator = new EmployeeAuthenticator();
        authenticator
            .setNext(new CustomerAuthenticator())
            .setNext(new NoUserAuthenticator());
        target = new LoginService(authenticator);
    }

    @Test
    void test_login_customer() {
        Response response = target.login("customer1@gmail.com", "password");
        assertEquals("SUCCESS", response.getResult());
        assertEquals("Customer Login Successful.", response.getMessage());
    }

    @Test
    void test_login_employee() {
        Response response = target.login("employee1@company.com", "password");
        assertEquals("SUCCESS", response.getResult());
        assertEquals("Employee Login Successful.", response.getMessage());
    }

    @Test
    void test_login_unknown() {
        Response response = target.login("somebody@company.com", "password");
        assertEquals("FAILURE", response.getResult());
        assertEquals("No User Found.", response.getMessage());
    }
}
// end::source[]