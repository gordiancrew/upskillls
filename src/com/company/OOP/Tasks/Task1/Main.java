package com.company.OOP.Tasks.Task1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main {
    //Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
    // вывести на консоль содержимое, дополнить, удалить.
    public static void main(String[] args) throws IOException {

        File file1 = new TextFile("a1");
        File file2 = new TextFile("a2");
        file1.createFile("hello");
        file1.printFileConsol();
        file2.createFile("Yahooo");
        Directory dir1 = new Directory("Direc1");
        dir1.setFileToDirectory(file1);
        dir1.setFileToDirectory(file2);
        file1.addToFile("my name is Vova");
        file1.printFileConsol();
        file1.addToFile("Good luck gays!!");
        System.out.println(dir1.getNameFilesDirectory());
        file1.printFileConsol();
    }
}
