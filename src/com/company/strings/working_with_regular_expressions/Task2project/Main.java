package com.company.strings.working_with_regular_expressions.Task2project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.company.strings.working_with_regular_expressions.Task2project.XmlAnalizator.analizText;
import static com.company.strings.working_with_regular_expressions.Task2project.XmlAnalizator.printText;

public class Main {
    //2.  Дана строка, содержащая следующий текст (xml-документ):
    //<notes>
    //   <note id = "1">qs
    //       <to>Вася</to>
    //       <from>Света</from>
    //       <heading>Напоминание</heading>
    //       <body>Позвони мне завтра!</body>
    //   </note>
    //   <note id = "2">
    //       <to>Петя</to>
    //       <from>Маша</from>
    //       <heading>Важное напоминание</heading>
    //       <body/>
    //   </note>
    //</notes>
    //Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип
    // (открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для
    // решения данной задачи нельзя.


    public static void main(String[] args) {
        String a = "<notes>\n" +
                "       <note id = \"1\">qs\n" +
                "           <to>Вася</to>\n" +
                "           <from>Света</from>\n" +
                "           <heading>Напоминание</heading>\n" +
                "           <body>Позвони мне завтра!</body>\n" +
                "       </note>\n" +
                "       <note id = \"2\">\n" +
                "           <to>Петя</to>\n" +
                "           <from>Маша</from>\n" +
                "           <heading>Важное напоминание</heading>\n" +
                "           <body/>\n" +
                "       </note>\n" +
                "    </notes>\n";
        System.out.println(printText(a));
        System.out.println(analizText(a));
    }
}







