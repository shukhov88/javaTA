package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Создание списка целых чисел.
        //Для остановвки чтения чисел с консоли нужно ввести пустое значение.
        ArrayList<Integer> intList = ListOfIntegers.createIntList();

        //Вывод четных чисел из списка
        EvenOdd.even(intList);

        //Вывод нечетных чисел из списка
        EvenOdd.odd(intList);

        //Вывод наибольшего числа из списка
        BigSmall.biggest(intList);

        //Вывод наименьшего числа из списка
        BigSmall.smallest(intList);

    }
}
