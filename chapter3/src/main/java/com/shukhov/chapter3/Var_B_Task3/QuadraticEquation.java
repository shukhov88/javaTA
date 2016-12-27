package com.shukhov.chapter3.Var_B_Task3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Задача № 3, Вариант В (Глава 2).
* Вычисление корней квадратного уравнения.
*/

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи параметры квадратного уравнения ax^2 + bx + c = 0 (a, b, c):");

        try {
            this.a = Double.parseDouble(reader.readLine());
            this.b = Double.parseDouble(reader.readLine());
            this.c = Double.parseDouble(reader.readLine());

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                reader.close();
            } catch (IOException io) {
                System.out.println(io);
            }
        }
    }

    public void printRoots() {

        double discriminanta = Math.pow(b, 2) - 4*a*c;
        double x1, x2;

        if (discriminanta > 0) {
            x1 = (-b + Math.sqrt(discriminanta)) / (2*a);
            x2 = (-b - Math.sqrt(discriminanta)) / (2*a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminanta == 0) {
            x1 = -(b/(2*a));
            System.out.println("Корни уравнения: x1 = x2 = " + x1);
        } else {
            System.out.println("У квадратного уравнения с такими параметрами нет корней");
        }
    }
}