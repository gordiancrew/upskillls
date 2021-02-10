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

    public ArrayList listBooksForAuthor(String author) {
       ArrayList<Book>booksAuthor=new ArrayList<>();
        for (int i=0; i<list.size();i++) {
            if (list.get(i).getAuthor().equals(author))
               booksAuthor.add(list.get(i));
        }
        return booksAuthor;
    }

    public ArrayList<Book> listBooksForPublishing(String publishing) {
       ArrayList<Book>booksPublish= new ArrayList<>();
        for (int i=0; i<list.size();i++) {
            if (list.get(i).getPublishing().equals(publishing))
               booksPublish.add(list.get(i));
        }
        return booksPublish;
    }

    public ArrayList listBooksFromYear(int year) {
       ArrayList<Book>bookYear=new ArrayList<>();
        for (int i=0; i<list.size();i++) {
            if (list.get(i).getYear() >= (year))
               bookYear.add(list.get(i));
        }
        return bookYear;
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
