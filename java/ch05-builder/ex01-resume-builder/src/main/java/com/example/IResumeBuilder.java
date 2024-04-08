package com.example;

// tag::source[]
public interface IResumeBuilder {
    void createEducationDetails();
    void createProjectDetails();
    void createSocialDetails();
    void createTestimonialDetails();
    void createPersonalDetails();
    void createCertificationDetails();
    void createNameAndTitle();
    Resume build();
}
// end::source[]