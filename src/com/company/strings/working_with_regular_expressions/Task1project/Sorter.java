package com.company.strings.working_with_regular_expressions.Task1project;

import java.util.Arrays;

import static com.company.strings.working_with_regular_expressions.Task1project.Spliter.*;

public class Sorter {

    public  static  String[] sortForNumberSentences(String a){
        String tmp;
        String[]list=splitIntoParagraphs(a);
        boolean isSorting = false;
        while (!isSorting)
            for (int i = 0; i < list.length - 1; i++) {
                isSorting = true;
                if (splitIntoSentences(list[i]).length > splitIntoSentences(list[i + 1]).length) {
                    tmp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = tmp;
                    isSorting = false;
                }
            }

        return list;

    }

    public static String[] sortWordsForLength(String a) {
        String[] listWords = splitIntoWords(a);
        String tmp;
        boolean isSorting = false;
        while (!isSorting) {
            isSorting = true;
            for (int t = 0; t < listWords.length - 1; t++) {
                if (listWords[t].length() > listWords[t + 1].length()) {
                    tmp = listWords[t];
                    listWords[t] = listWords[t + 1];
                    listWords[t + 1] = tmp;
                    isSorting = false;
                }
            }
        }
        return listWords;
    }


    public  static String[] sortWordsForLexems(String a){
        String[] wordsList = splitIntoWords(a);
        String tmp;
        boolean isSorting = false;
        while (!isSorting) {
            isSorting = true;
            for (int j = 0; j < wordsList.length - 1; j++) {
                if (countLexemCharO(wordsList[j]) < countLexemCharO(wordsList[j + 1])) {
                    tmp = wordsList[j];
                    wordsList[j] = wordsList[j + 1];
                    wordsList[j + 1] = tmp;
                    isSorting=false;
                } else if (countLexemCharO(wordsList[j]) == countLexemCharO(wordsList[j + 1])) {
                    if (wordsList[j].toLowerCase().charAt(0) > wordsList[j + 1].toLowerCase().charAt(0)) {
                        tmp = wordsList[j];
                        wordsList[j] = wordsList[j + 1];
                        wordsList[j + 1] = tmp;
                        isSorting=false;
                    }
                }
            }
        }
       return wordsList;
    }

    private static int countLexemCharO(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'о') {
                count++;
            }
        }
        return count;
    }
}
