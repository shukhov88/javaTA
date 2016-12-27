package com.shukhov.chapter3.Var_B_Task1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Создание дроби в конструкторе (ввод числителя и знаменателя с консоли)
* */

public class Fraction {

    private int numerator;
    private int denominator;
    private static int count;

    public Fraction () throws IOException {
        count++;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи числитель дроби #" + count);
        numerator = Integer.parseInt(reader.readLine());
        System.out.println("Введи знаменатель дроби #" + count);
        denominator = Integer.parseInt(reader.readLine());
    }

    public void setNumerator(int a) {
        this.numerator = a;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setDenominator(int b) {
        this.numerator = b;
    }

    public int getDenominator() {
        return this.denominator;
    }

    @Override
    public String toString() {
        return this.getNumerator() + "/" + this.getDenominator();
    }

    public void add(Fraction a) {
        if (denominator == a.getDenominator()) {
            numerator += a.getNumerator();
        } else {
            numerator = numerator*a.getDenominator() + a.getNumerator()*denominator;
            denominator *= a.getDenominator();
        }

        int max = 0;
        if (denominator > numerator) {
            max = denominator;
        } else {
            max = numerator;
        }

        for (int i = max; i > 1; i--) {
            if ((numerator % i == 0) && (denominator % i == 0)) {
                numerator /= i;
                denominator /= i;
                break;
            }
        }

    }

}
