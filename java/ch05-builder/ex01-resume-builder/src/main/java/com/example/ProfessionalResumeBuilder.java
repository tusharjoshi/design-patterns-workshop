package com.example;

// tag::source[]
public class ProfessionalResumeBuilder extends AbstractResumeBuilder {

    public void createEducationDetails() {
        resume.addSection("Professional Education");
    }

    public void createProjectDetails() {
        resume.addSection("Professional Projects");
    }

    public void createSocialDetails() {
        resume.addSection("Professional Social");
    }

    public void createTestimonialDetails() {
        resume.addSection("Professional Testimonials");
    }

    public void createPersonalDetails() {
        resume.addSection("Professional Personal");
    }

    public void createCertificationDetails() {
        resume.addSection("Professional Certifications");
    }

    public void createNameAndTitle() {
        resume.addSection("Professional NameAndTitle");
    }
}
// end::source[]