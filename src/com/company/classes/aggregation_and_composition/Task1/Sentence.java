package com.company.classes.aggregation_and_composition.Task1;

import com.company.algoritmization.decomposition.Task5project.Array;

import java.util.ArrayList;

public class Sentence {
    ArrayList<Word> sentence;

    public Sentence() {
        sentence = new ArrayList<Word>();
    }

    public Sentence(ArrayList<Word> sentence) {
        this.sentence = sentence;
    }

    public void setWordToSentence(Word word) {
        sentence.add(word);
    }

    public String getSentence() {
        StringBuilder str = new StringBuilder();
        for (int i=0;i<sentence.size();i++) {
          if(i==0){
            str.append(sentence.get(i).firstWord(sentence.get(i).getWord())+" ") ;
          }
          else if(i==sentence.size()-1)
              str.append(sentence.get(i).getWord()+".") ;
          else
              str.append(sentence.get(i).getWord()+" ") ;
        }

        return str.toString();
    }


    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + sentence +
                '}';
    }
}
