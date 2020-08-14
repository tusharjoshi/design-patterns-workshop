package com.example;

import java.util.Set;
import java.util.List;

// tag::source[]
public interface IVocabularyStore {
    int getWordCount();
    Set<String> getWordList();
    String getMeaning(String word);
    List<String> getUnlearnedWords();
    void setWordLearned(String word);
    void setWordUnLearned(String word);
    IVocabularyStore getCopy();
}
// end::source[]