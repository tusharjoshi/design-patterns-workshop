package com.example;

// tag::source[]
public class SomeFeature {
    public void feature() {
        IAuditor auditor = AuditorFactory.create();
        auditor.log("feature was called.");
    }
}
// end::source[]