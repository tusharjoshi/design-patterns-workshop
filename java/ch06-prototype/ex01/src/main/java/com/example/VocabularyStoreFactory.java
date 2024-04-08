package com.example;

import javax.swing.DefaultBoundedRangeModel;

// tag::source[]
public class VocabularyStoreFactory {
    private static IVocabularyStore vocabularyStore = new DefaultVocabularyStore();

    public static IVocabularyStore getVocabularyStore() {
        return vocabularyStore.getCopy();
    }
}
// end::source[]