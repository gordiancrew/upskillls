package com.company.strings.working_with_regular_expressions.Task2project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlAnalizator {

    public static String analizText(String a){
        StringBuilder str= new StringBuilder();
        String[] list = a.split("\\n\\s");
        int countSpace = 0;
        for (String x : list) {
            Pattern teg = Pattern.compile("<([^/]+)>");
            Pattern body = Pattern.compile(">(.+)<");
            Pattern tegClose = Pattern.compile("<[/].+>");
            Pattern noBody= Pattern.compile("<.+[/]>");
            Matcher findTeg = teg.matcher(x);
            Matcher findBody = body.matcher(x);
            Matcher findTegClose = tegClose.matcher(x);
            Matcher findNoBody= noBody.matcher(x);
            if(findNoBody.find()){
                str.append("\n"+findNoBody.group()+"-teg without body.");
            }
            if (findTeg.find()) {
                str.append("\n"  + findTeg.group() + "-teg open.");
            }
            if (findBody.find()) {
                str.append("\n " + findBody.group(1)+"-body.");
            }
            if (findTegClose.find()) {
                str.append("\n"+findTegClose.group()+"-teg close.");
            }
        }
        return str.toString();
    }

    public static String printText(String a){
        StringBuilder str= new StringBuilder();
        String[] list = a.split("\\n\\s");
        int countSpace = 0;
        for (String x : list) {
            Pattern teg = Pattern.compile("<([^/]+)>");
            Pattern body = Pattern.compile(">(.+)<");
            Pattern tegClose = Pattern.compile("<[/].+>");
            Matcher findTeg = teg.matcher(x);
            Matcher findBody = body.matcher(x);
            Matcher findTegClose = tegClose.matcher(x);
            if (findTeg.find()) {
               str.append("\n" + printSpace(countSpace) + findTeg.group(1) + ":");
                countSpace++;
            }
            if (findBody.find()) {
                str.append("  " + findBody.group(1));
            }
            if (findTegClose.find()) {
                countSpace--;
            }
        }
        return str.toString();
    }

    public static String printSpace(int count) {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            s.append("  ");
        }
        return s.toString();
    }
}
