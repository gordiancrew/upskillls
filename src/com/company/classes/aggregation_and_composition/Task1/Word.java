package com.company.classes.aggregation_and_composition.Task1;

import static java.lang.Character.toUpperCase;

public class Word {
    String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String firstWord(String firtWord) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < firtWord.length(); i++) {
            if (i == 0) {
                str.append(toUpperCase(firtWord.charAt(i)));
            } else
                str.append(firtWord.charAt(i));
        }
        return str.toString();
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }
}
