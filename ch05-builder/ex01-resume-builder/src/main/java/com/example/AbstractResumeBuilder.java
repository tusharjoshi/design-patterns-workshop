package com.example;

// tag::source[]
public abstract class AbstractResumeBuilder implements IResumeBuilder {

    Resume resume = new Resume();

    public Resume build() {
        Resume resumeToReturn = resume;
        resume = new Resume();
        return resumeToReturn;
    }
}
// end::source[]