package com.company.classes.aggregation_and_composition.Task1;

import java.util.ArrayList;

public class Text {
    private ArrayList<Sentence> text = new ArrayList<>();
    private String heading;

    public Text() {
    }

    public Text(String heading, ArrayList<Sentence> text) {
        this.heading = heading;
        this.text = text;
    }

    public String getText() {
        StringBuilder str = new StringBuilder();
        str.append(heading + ":\n ");
        for (Sentence x : text)
            str.append(x.getSentence());
        return str.toString();
    }

    @Override
    public String toString() {
        return "Text{" +
                "text=" + text +
                '}';
    }
}
