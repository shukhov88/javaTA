package com.company;


import java.util.ArrayList;

public class EvenOdd {

    public static void even (ArrayList<Integer> list) {

        System.out.print("Even: ");
        int counter = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) % 2 == 0) {
                counter++;
                System.out.print(list.get(i) + " ");
            }
        }

        if (counter == 0) {
            System.out.print("There was no even numbers in list.");
        }

        System.out.print("\n");
    }

    public static void odd (ArrayList<Integer> list) {

        System.out.print("Odd: ");
        int counter = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) % 2 != 0) {
                counter++;
                System.out.print(list.get(i) + " ");
            }
        }

        if (counter == 0) {
            System.out.print("There was no odd numbers in list.");
        }

        System.out.print("\n");
    }

}
