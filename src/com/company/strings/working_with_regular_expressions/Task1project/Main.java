package com.company.strings.working_with_regular_expressions.Task1project;

import java.util.Arrays;

public class Main {
    //1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом
    // три различных операции: отсортировать абзацы по количеству предложений;
    // в каждом предложении отсортировать слова по длине; отсортировать лексемы в предложении по убыванию
    // количества вхождений заданного символа, а в случае равенства – по алфавиту.
    public static void main(String[] args) {
        TextAnalizator a = new TextAnalizator();
        String text = "Да! Я помню чудное мгновенье.\nПередо мной явилась ты. Как мимолетное виденье. Внезапно.\nКак гений чистой красоты!";
        //a.setText(text);
        System.out.println("Sort paragraphs of number sentences: \n" + a.sortParagraphsOfNumberSentences(text));
        System.out.println("\nSort sentences of words lentghs : \n"+a.SortSentencesOfWordLengths(text));
        System.out.println("\nSort sentences of lexems : \n"+a.SortLexemOfSentences(text));

    }
}
