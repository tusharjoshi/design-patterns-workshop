package com.company.example;

// tag::source[]
public class EmployeeAuthenticator extends AbstractAuthenticator {

    private String[] employeeList = {
        "employee1@company.com",
        "employee2@company.com"
    };

    public Response authenticate(Request request) {
        for(String enployee : employeeList) {
            if(enployee.equals(request.getUsername())) {
                Response response = new Response();
                response.setResult("SUCCESS");
                response.setMessage("Employee Login Successful.");
                return response;
            }
        }

        return super.authenticate(request);
    }
}
// end::source[]