package com.example;

// tag::source[]
public class AuditorFactory {
    public static IAuditor create() {
        return new FileSystemAuditor();
    }
}
// end::source[]