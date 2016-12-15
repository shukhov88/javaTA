package com.company.chapter_1;

import java.util.List;

/*
* Методы, которые выводят на консоль четные и нечетные числа из списка.
* */

public class EvenOdd {

    private List<Integer> numList;

    EvenOdd (List<Integer> numList) {
        this.numList = numList;
    }

    //метод вывода четных чисел
    public void even () {

        System.out.print("Even: ");
        int counter = 0;

        for (int i = 0; i < numList.size(); i++) {

            if (numList.get(i) % 2 == 0) {
                counter++;
                System.out.print(numList.get(i) + " ");
            }
        }

        if (counter == 0) {
            System.out.print("There was no even numbers in list.");
        }

        System.out.print("\n");
    }

    //метод вывода нечетных чисел
    public void odd () {

        System.out.print("Odd: ");
        int counter = 0;

        for (int i = 0; i < numList.size(); i++) {

            if (numList.get(i) % 2 != 0) {
                counter++;
                System.out.print(numList.get(i) + " ");
            }
        }

        if (counter == 0) {
            System.out.print("There was no odd numbers in list.");
        }

        System.out.print("\n");
    }

}
