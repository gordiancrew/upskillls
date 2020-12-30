package com.company.algoritmization.sorting;

import java.util.Arrays;

public class Task2 {
    //Реализуйте сортировку выбором.
    public static void main(String[] args) {
        int []a={2,7,5,3,7,0,7,4,2,2,5,3,9,8};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(selectionSort(a)));
    }
    public static int[]selectionSort(int[]a){
        for(int i=0;i<a.length;i++){
            int pos=i;
            int min=a[i];
            for(int j=i+1;j<a.length;j++){
               if(a[j]<min){
               pos=j;
               min=a[j];
               }
            }
            a[pos]=a[i];
            a[i]=min;
        }
        return a;
    }
}
