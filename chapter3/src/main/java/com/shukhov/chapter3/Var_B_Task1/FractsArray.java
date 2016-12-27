package com.shukhov.chapter3.Var_B_Task1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Создание массива дробей в конструкторе (ввод рамзера массива с консоли)
* */

public class FractsArray {

    private Fraction[] fractsArray;
    private int arraySize;

    public FractsArray() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи количество дроби в патроне:");
        arraySize = Integer.parseInt(reader.readLine());

        fractsArray = new Fraction[arraySize];

        for (int i = 0; i < arraySize; i++) {
            fractsArray[i] = new Fraction();
        }
        reader.close();
    }

    public void addOddToEven() {
        for (int i = 2; i < arraySize-1; i++) {
            if (i%2 == 0) {
                fractsArray[i].add(fractsArray[i+1]);
            }
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < arraySize; i++) {
            result = result + " " + fractsArray[i].toString();
        }
        return result;
    }

}
