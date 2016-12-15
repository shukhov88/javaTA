package com.company.chapter_1;

import java.util.List;

/*
* Методы вывода наибольшего и наименьшего чисел из списка.
* */

public class BigSmall {

    private List<Integer> numList;

    BigSmall (List<Integer> numList) {
        this.numList = numList;
    }

    //метод вывода наибольшего чисел из списка
    public void biggest () {

        int biggest = numList.get(0);

        for (int i = 1; i < numList.size(); i++) {

            if (biggest < numList.get(i)) {
                biggest = numList.get(i);
            }
        }

        System.out.println("Biggest number: " + biggest);
    }

    //метод вывода наименьшего чисел из списка
    public void smallest () {

        int smallest = numList.get(0);

        for (int i = 1; i < numList.size(); i++) {

            if (smallest > numList.get(i)) {
                smallest = numList.get(i);
            }
        }

        System.out.println("Smallest number: " + smallest);
    }

}
