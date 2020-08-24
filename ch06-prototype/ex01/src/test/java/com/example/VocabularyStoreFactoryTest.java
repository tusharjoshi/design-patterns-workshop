package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// tag::source[]
class VocabularyStoreFactoryTest {

    @Test
    void check_stores_are_different() {
        IVocabularyStore store1 = VocabularyStoreFactory.getVocabularyStore();
        IVocabularyStore store2 = VocabularyStoreFactory.getVocabularyStore();
        assertNotEquals(store1, store2);
    }

    @Test
    void check_stores_are_differentcontain_base_words() {
        IVocabularyStore store1 = VocabularyStoreFactory.getVocabularyStore();
        IVocabularyStore store2 = VocabularyStoreFactory.getVocabularyStore();

        assertEquals("n. Not an issue", store1.getMeaning("feature"));
        assertEquals("n. Slogging for the whole night", store1.getMeaning("night"));

        assertEquals("n. Not an issue", store2.getMeaning("feature"));
        assertEquals("n. Slogging for the whole night", store2.getMeaning("night"));
    }
}
// end::source[]