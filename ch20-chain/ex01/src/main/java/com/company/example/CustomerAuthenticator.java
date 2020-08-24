package com.company.example;

// tag::source[]
public class CustomerAuthenticator extends AbstractAuthenticator {

    private String[] customerList = {
        "customer1@gmail.com",
        "customer2@rediffmain.com"
    };

    public Response authenticate(Request request) {
        for(String customer : customerList) {
            if(customer.equals(request.getUsername())) {
                Response response = new Response();
                response.setResult("SUCCESS");
                response.setMessage("Customer Login Successful.");
                return response;
            }
        }

        return super.authenticate(request);
    }
}
// end::source[]