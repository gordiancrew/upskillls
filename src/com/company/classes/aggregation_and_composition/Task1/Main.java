package com.company.classes.aggregation_and_composition.Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //1. Создать объект класса Текст, используя классы Предложение, Слово.
    // Методы: дополнить текст, вывести на консоль текст, заголовок текста.
    public static void main(String[] args) {
        Word w1 = new Word("baby");
        Word w2 = new Word("comon");
        Word w3 = new Word("go");
        Sentence s1 = new Sentence(new ArrayList<>(Arrays.asList(w1, w2, w3)));
        Word w21 = new Word("London");
        Word w22 = new Word("is");
        Word w23 = new Word("capital");
        Word w24 = new Word("of");
        Word w25 = new Word("Greate Britain");
        Sentence s2 = new Sentence(new ArrayList<>(Arrays.asList(w23, w24, w25, w22, w21)));
        Text t = new Text("First poem",new ArrayList<>(Arrays.asList(s1, s2)));
        System.out.println(t.getText());
    }
}
