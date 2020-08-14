package com.example;

// tag::source[]
public class SocialResumeBuilder extends AbstractResumeBuilder {

    public void createEducationDetails() {
        resume.addSection("Social Education");
    }

    public void createProjectDetails() {
        resume.addSection("Social Projects");
    }

    public void createSocialDetails() {
        resume.addSection("Social Social");
    }

    public void createTestimonialDetails() {
        resume.addSection("Social Testimonials");
    }

    public void createPersonalDetails() {
        resume.addSection("Social Personal");
    }

    public void createCertificationDetails() {
        resume.addSection("Social Certifications");
    }

    public void createNameAndTitle() {
        resume.addSection("Social NameAndTitle");
    }
}
// end::source[]