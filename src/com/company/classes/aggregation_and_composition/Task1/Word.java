package com.company.classes.aggregation_and_composition.Task1;

import static java.lang.Character.toUpperCase;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }
}
