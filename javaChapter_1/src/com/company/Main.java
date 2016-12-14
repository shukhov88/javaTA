package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> intList = ListOfIntegers.createIntList();

        EvenOdd.even(intList);
        EvenOdd.odd(intList);

        BigSmall.biggest(intList);
        BigSmall.smallest(intList);

    }
}
