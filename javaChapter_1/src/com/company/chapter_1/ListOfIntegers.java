package com.company.chapter_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
* Создание списка целых чисел введенных с консоли.
* !!! Для остановки ввода с консоли нужно нажать "Enter" (ввод пустого значения) !!!
* */

public class ListOfIntegers {

    public static List<Integer> createIntList() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> intList = new ArrayList<>();

        while (true) {
            try {
                String temp = reader.readLine();
                if (temp.equals("")){
                    reader.close();
                    break;
                }

                intList.add(Integer.parseInt(temp));

            } catch (IOException e) {
                System.out.println("Input list of integers");
            }
        }

        return intList;

    }


}
