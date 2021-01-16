package com.company.algoritmization.decomposition.Task5project;

import java.util.Arrays;

public class Main {
    //5. Составить программу, которая в массиве A[N] находит второе по величине число
    // (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

    public static void main(String[] args) {
     Array a=new Array();
     int[] array = {2, 4, 1, 9, 1, 4, 32, 2, 9, 48, 77, 5, 44, 3,};
     a.setArray(array);
     a.PrintSecondMax();
    }
}
