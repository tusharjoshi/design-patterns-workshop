package com.example;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.Map.Entry;

// tag::source[]
public class DefaultVocabularyStore implements IVocabularyStore {

    private Map<String, String> wordMap;

    public DefaultVocabularyStore() {
        this.wordMap = new HashMap<>();
        // expensive word loading operation here
        this.wordMap.put("feature", "n. Not an issue");
        this.wordMap.put("night", "n. Slogging for the whole night");
    }

    private DefaultVocabularyStore(Map<String, String> wordMap) {
        this.wordMap = wordMap;
    }

    public int getWordCount() {
        return wordMap.size();
    }

    public Set<String> getWordList() {
        return wordMap.keySet();
    }

    public String getMeaning(String word) {
        return wordMap.get(word);
    }

    public List<String> getUnlearnedWords() {
        // some logic
        return null;
    }

    public void setWordLearned(String word) {
        // some logic
    }

    public void setWordUnLearned(String word) {
        // some logic
    }

    public IVocabularyStore getCopy() {
        Map<String, String> newWordMap = new HashMap<>();
        for(Entry<String, String> entry : wordMap.entrySet()) {
            newWordMap.put(entry.getKey(), entry.getValue());
        }
        return new DefaultVocabularyStore(newWordMap);
    }
}
// end::source[]