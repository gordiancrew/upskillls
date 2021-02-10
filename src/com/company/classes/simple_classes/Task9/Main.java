package com.company.classes.simple_classes.Task9;

import javax.xml.crypto.Data;
import java.util.Date;

public class Main {
    //9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы,
    // set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив типа Book,
    // с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
    //Найти и вывести:
    //a) список книг заданного автора;
    //b) список книг, выпущенных заданным издательством;
    //c) список книг, выпущенных после заданного года.
    public static void main(String[] args) {
        BooksList booklist1 = new BooksList();
        booklist1.setBook(new Book("Idiot", "Dostoevsky", "Moskva", 1980, 2000, 20, "Hard"));
        booklist1.setBook(new Book("Igrok", "Dostoevsky", "Minsk", 2001, 1000, 10, "Hard"));
        booklist1.setBook(new Book("Revizor", "Gogol", "Moskva", 1999, 1800, 12, "Soft"));
        booklist1.setBook(new Book("Vij", "Gogol", "Moskva", 2003, 1100, 11, "Soft"));
        booklist1.setBook(new Book("Evgeny Onegin", "Pushkin", "Minsk", 1979, 800, 12, "Hard"));
        System.out.println(booklist1);
        booklist1.listBooksForAuthor("Gogol");
        booklist1.listBooksForPublishing("Moskva");
        booklist1.listBooksFromYear(1990);
    }
}
