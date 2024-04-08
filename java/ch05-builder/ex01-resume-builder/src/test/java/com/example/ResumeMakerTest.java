package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class ResumeMakerTest {

    @Test
    public void ensure_professional_cv() {
        IResumeBuilder builder = new ProfessionalResumeBuilder();
        ResumeMaker maker = new ResumeMaker(builder);
        maker.makeCV();
        Resume resume = builder.build();

        String cvText = "Professional NameAndTitle"
                        + "Professional Projects"
                        + "Professional Testimonials"
                        + "Professional Certifications"
                        + "Professional Education"
                        + "Professional Social"
                        + "Professional Personal";

        assertEquals(cvText, resume.toString());
    }

    @Test
    public void ensure_professional_resume() {
        IResumeBuilder builder = new ProfessionalResumeBuilder();
        ResumeMaker maker = new ResumeMaker(builder);
        maker.makeResume();
        Resume resume = builder.build();

        String cvText = "Professional NameAndTitle"
                        + "Professional Projects"
                        + "Professional Certifications"
                        + "Professional Education"
                        + "Professional Personal";

        assertEquals(cvText, resume.toString());
    }

    @Test
    public void ensure_professional_one_pager() {
        IResumeBuilder builder = new ProfessionalResumeBuilder();
        ResumeMaker maker = new ResumeMaker(builder);
        maker.makeOnePagerResume();
        Resume resume = builder.build();

        String cvText = "Professional NameAndTitle"
                        + "Professional Projects"
                        + "Professional Personal";

        assertEquals(cvText, resume.toString());
    }

    @Test
    public void ensure_social_cv() {
        IResumeBuilder builder = new SocialResumeBuilder();
        ResumeMaker maker = new ResumeMaker(builder);
        maker.makeCV();
        Resume resume = builder.build();

        String cvText = "Social NameAndTitle"
                        + "Social Projects"
                        + "Social Testimonials"
                        + "Social Certifications"
                        + "Social Education"
                        + "Social Social"
                        + "Social Personal";

        assertEquals(cvText, resume.toString());
    }

    @Test
    public void ensure_social_resume() {
        IResumeBuilder builder = new SocialResumeBuilder();
        ResumeMaker maker = new ResumeMaker(builder);
        maker.makeResume();
        Resume resume = builder.build();

        String cvText = "Social NameAndTitle"
                        + "Social Projects"
                        + "Social Certifications"
                        + "Social Education"
                        + "Social Personal";

        assertEquals(cvText, resume.toString());
    }

    @Test
    public void ensure_social_one_pager() {
        IResumeBuilder builder = new SocialResumeBuilder();
        ResumeMaker maker = new ResumeMaker(builder);
        maker.makeOnePagerResume();
        Resume resume = builder.build();

        String cvText = "Social NameAndTitle"
                        + "Social Projects"
                        + "Social Personal";

        assertEquals(cvText, resume.toString());
    }
}
// end::source[]