package com.company.OOP.Tasks.Task1;

import java.io.IOException;

public abstract class File {
    String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void createFile(String name) throws IOException;

    public abstract void printFileConsol();

    public abstract void deleteFile();

    public abstract void renameFile(String newName) ;

    public void addToFile(String input) throws IOException {

    }

}
