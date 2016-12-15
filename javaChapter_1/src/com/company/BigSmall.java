package com.company;

import java.util.ArrayList;

/*
* Методы вывода наибольшего и наименьшего чисел из списка.
* */

public class BigSmall {

    //метод вывода наибольшего чисел из списка
    public static void biggest (ArrayList<Integer> list) {

        int biggest = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            if (biggest < list.get(i)) {
                biggest = list.get(i);
            }
        }

        System.out.println("Biggest number: " + biggest);
    }

    //метод вывода наименьшего чисел из списка
    public static void smallest (ArrayList<Integer> list) {

        int smallest = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            if (smallest > list.get(i)) {
                smallest = list.get(i);
            }
        }

        System.out.println("Smallest number: " + smallest);
    }

}
