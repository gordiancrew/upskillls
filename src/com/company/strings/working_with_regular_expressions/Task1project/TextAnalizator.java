package com.company.strings.working_with_regular_expressions.Task1project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

import static com.company.strings.working_with_regular_expressions.Task1project.Sorter.*;
import static com.company.strings.working_with_regular_expressions.Task1project.Spliter.*;

public class TextAnalizator {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String sortParagraphsOfNumberSentences(String a) {
        return Arrays.toString(sortForNumberSentences(a));
    }

    public String SortSentencesOfWordLengths(String a) {
        String[] list = splitIntoSentences(a);
        for (int i = 0; i < list.length; i++) {
            list[i] = (Arrays.toString(sortWordsForLength(list[i])));
        }
        return Arrays.toString(list);
    }

    public String SortLexemOfSentences(String a) {
        String[] sentencesList = splitIntoSentences(a);
        for (int i = 0; i < sentencesList.length; i++) {
            sentencesList[i] = Arrays.toString(sortWordsForLexems(sentencesList[i]));
        }
        return Arrays.toString(sentencesList);
    }
}
