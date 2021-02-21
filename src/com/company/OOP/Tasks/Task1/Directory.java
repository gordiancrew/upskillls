package com.company.OOP.Tasks.Task1;

import java.util.ArrayList;

public class Directory {
    private String nameDirectory;
    ArrayList<File> files;

    public Directory(String nameDirectory) {
        this.nameDirectory = nameDirectory;
        files = new ArrayList<>();
    }

    public void setFileToDirectory(File file) {
        files.add(file);
    }

    public String getNameDirectory() {
        return nameDirectory;
    }

    public String getNameFilesDirectory() {
        StringBuilder str = new StringBuilder();
        str.append("List files of directory \"" + getNameDirectory() + "\":");
        for (int i = 0; i < files.size(); i++) {
            str.append("\n" + (i + 1) + ")" + files.get(i).getName());

        }
        return str.toString();
    }
}
