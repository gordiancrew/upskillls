package com.company.classes.simple_classes.Task9;

public class Book {
    private static int generatorID = 0;
    private int id;
    private String name;
    private String author;
    private String publishing;
    private int year;
    private int numberOfPages;
    private double price;
    private String binding;

    public Book() {
        generatorID++;
        name = "id"+generatorID;
        author = "no name";
        publishing = " ";
        year = 0;
        numberOfPages = 0;
        price = 0;
        binding = " ";
        id = generatorID;
    }

    public Book(String name, String author, String publishing, int year, int numberOfPages, double price, String binding) {
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.binding = binding;
        generatorID++;
        id = generatorID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getBinding() {
        return binding;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", id is:" + getId() + ", author is: " + getAuthor() + ", publishing is: " + getPublishing() +
                ", year is: " + getYear() + ", number of pages is: " + getNumberOfPages() + ", price is: " + getPrice() + ", binding is: " + getBinding();
    }
}
