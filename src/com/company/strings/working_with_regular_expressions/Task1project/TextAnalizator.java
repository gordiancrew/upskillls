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

    public String sortParagraphsOfNumberSentences(String a) {
        String[] list = splitIntoParagraphs(a);
        String tmp;
        StringBuilder str = new StringBuilder("");
        boolean isSorting = false;
        while (!isSorting)

            for (int i = 0; i < list.length - 1; i++) {
                isSorting = true;
                if (list[i].length() > list[i + 1].length()) {
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
        System.out.println(Arrays.toString(sentencesList));
        return sentencesList;
    }

    public String[] splitIntoWords(String a) {
        String input = a.trim();
        String[] list = input.split(" ");
        System.out.println(Arrays.toString(list));
        return list;
    }
}
