package com.company.strings.working_with_regular_expressions.Task1project;

public class Spliter {
    public static String[] splitIntoParagraphs(String a) {
        String[] paragraphlist = a.split("\n");
        return paragraphlist;
    }

    public static String[] splitIntoSentences(String a) {
        String[] sentencesList = a.split("[.?!]");
        // System.out.println(Arrays.toString(sentencesList));
        return sentencesList;
    }

    public static String[] splitIntoWords(String a) {
        String input = a.trim();
        String[] list = input.split(" ");
        //System.out.println(Arrays.toString(list));
        return list;
    }
}
