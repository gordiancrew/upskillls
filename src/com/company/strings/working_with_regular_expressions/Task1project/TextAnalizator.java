package com.company.strings.working_with_regular_expressions.Task1project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TextAnalizator {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public void printSortLexemOfSentences(String a) {
        String[] sentencesList = splitIntoSentences(a);
        String tmp;
        for (int i = 0; i < sentencesList.length; i++) {
            String[] wordsList = splitIntoWords(sentencesList[i]);
            for (int k = 0; k < wordsList.length; k++) {
                for (int j = 0; j < wordsList.length - 1; j++) {
                    if (countLexemCharA(wordsList[j]) < countLexemCharA(wordsList[j + 1])) {
                        tmp = wordsList[j];
                        wordsList[j] = wordsList[j + 1];
                        wordsList[j + 1] = tmp;
                    } else if (countLexemCharA(wordsList[j]) == countLexemCharA(wordsList[j + 1])) {
                        if (wordsList[j].toLowerCase().charAt(0) > wordsList[j + 1].toLowerCase().charAt(0)) {
                            tmp = wordsList[j];
                            wordsList[j] = wordsList[j + 1];
                            wordsList[j + 1] = tmp;
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(wordsList));
        }
    }

    public void printSortSentencesOfWordLengths(String a) {
        String[] list = splitIntoSentences(a);
        for (int i = 0; i < list.length; i++) {
            String[] listWords = splitIntoWords(list[i]);
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
            System.out.println(Arrays.toString(listWords));
        }
    }

    public String sortParagraphsOfNumberSentences(String a) {
        String[] list = splitIntoParagraphs(a);
        String tmp;
        StringBuilder str = new StringBuilder("");
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
        for (int i = 0; i < list.length; i++) {
            str = str.append(list[i] + "\n");
        }
        return str.toString();
    }

    public String[] splitIntoParagraphs(String a) {
        String[] paragraphlist = a.split("\n");
        return paragraphlist;
    }

    public String[] splitIntoSentences(String a) {
        String[] sentencesList = a.split("[.?!]");
        // System.out.println(Arrays.toString(sentencesList));
        return sentencesList;
    }

    public String[] splitIntoWords(String a) {
        String input = a.trim();
        String[] list = input.split(" ");
        //System.out.println(Arrays.toString(list));
        return list;
    }

    public int countLexemCharA(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'о') {
                count++;
            }
        }
        return count;
    }
}
