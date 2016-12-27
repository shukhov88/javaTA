package com.shukhov.chapter3.Runner;


import com.shukhov.chapter3.Var_B_Task1.FractsArray;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {

        FractsArray frArr = new FractsArray();
        System.out.println(frArr.toString());
        frArr.addOddToEven();
        System.out.println(frArr.toString());

    }
}
