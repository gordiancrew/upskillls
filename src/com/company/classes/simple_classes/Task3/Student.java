package com.company.classes.simple_classes.Task3;

import java.util.ArrayList;

public class Student {
    private String name;
    private int groupe;
    private int[] marks;
    public Student(String name, int groupe, int[]marks){
       this.name=name;
       this.groupe= groupe;
       this.marks=marks;
    }
    public  static void printGoodStudent(ArrayList<Student>list){
        for(Student x:list) {
          if (GoodStudy(x.marks)){
              System.out.println("Good student "+x.name+"Number group- "+x.groupe);
          }
       }
    }

    private static  boolean GoodStudy(int[]marks){
        for (int y:marks) {
         if(y<9)
           return  false;
        }
        return  true;
    }
}
