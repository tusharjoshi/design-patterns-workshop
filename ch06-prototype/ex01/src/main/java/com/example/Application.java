package com.example;

// tag::source[]
public class Application {
    private IVocabularyStore vocabularyStore;

    public void start() {
        vocabularyStore = VocabularyStoreFactory.getVocabularyStore();
        // Use this store for the user
    }
}
// end::source[]