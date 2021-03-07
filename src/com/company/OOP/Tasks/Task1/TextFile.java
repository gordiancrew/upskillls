package com.company.OOP.Tasks.Task1;

import java.io.*;
import java.util.Scanner;

public class TextFile extends File {
    java.io.File file;



    public TextFile(String name) throws IOException {
        super(name);
        this.name = name;
        file = new java.io.File("src/com/company/OOP/Tasks/Task1/" + name);
    }

    @Override
    public void createFile(String input) throws IOException {

        FileWriter filewriter = new FileWriter(file);
        filewriter.write(input);
        filewriter.close();
    }

    @Override
    public void addToFile(String input) throws IOException {
        String a=toString();
        FileWriter filewriter = new FileWriter(file);
        filewriter.write(a+input);
        filewriter.close();
    }

    @Override
    public void printFileConsol()  {
        System.out.println(toString());
    }

    @Override
    public String toString()  {
        StringBuilder str= new StringBuilder();
        Scanner scan = null;
        try {
            scan = new Scanner(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scan.hasNextLine())
            str.append(scan.nextLine()+"\n");
        scan.close();
        return  str.toString();
    }

    @Override
    public void deleteFile() {
        file.delete();
    }

    @Override
    public void renameFile(String newName) {
        file.renameTo(new java.io.File("src/com/company/OOP/Tasks/Task1/" + newName));
        file = new java.io.File("src/com/company/OOP/Tasks/Task1/" + newName);
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
