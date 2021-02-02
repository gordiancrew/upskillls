package com.company.classes.simple_classes.Task9;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;

public class BooksList {

    private ArrayList<Book> list;

    public BooksList() {
        list = new ArrayList<>();
    }

    public void setBook(Book book) {
        list.add(book);
    }

    public ArrayList<Book> getList() {
        return list;
    }

    public void listBooksForAuthor(String author) {
        System.out.println("BOOKS OF AUTHOR " + author.toUpperCase() + " :");
        for (Book x : list) {
            if (x.getAuthor().equals(author))
                System.out.println(x);
        }
    }

    public void listBooksForPublishing(String publishing) {
        System.out.println("BOOKS OF PUBLISHING " + publishing.toUpperCase() + " :");
        for (Book x : list) {
            if (x.getPublishing().equals(publishing))
                System.out.println(x);
        }
    }

    public void listBooksFromYear(int year) {
        System.out.println("BOOKS OF EAST YEAR " + year + " :");
        for (Book x : list) {
            if (x.getYear() >= (year))
                System.out.println(x);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Book x : list) {
            str.append(x);
            str.append("\n");
        }
        return str.toString();
    }
}
