package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Создание списка целых чисел.
        //Для остановвки чтения чисел с консоли нужно ввести пустое значение.
        List<Integer> intList = ListOfIntegers.createIntList();

        //создание объекта
        EvenOdd eo = new EvenOdd(intList);

        //Вывод четных чисел из списка
        eo.even();

        //Вывод нечетных чисел из списка
        eo.odd();

        //создание объекта
        BigSmall bs = new BigSmall(intList);

        //Вывод наибольшего числа из списка
        bs.biggest();

        //Вывод наименьшего числа из списка
        bs.smallest();

    }
}
