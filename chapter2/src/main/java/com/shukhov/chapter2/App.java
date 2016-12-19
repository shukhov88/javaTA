package com.shukhov.chapter2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void main( String[] args ) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введи параметры квадратного уравнения ax^2 + bx + x = 0");
            double a = Double.parseDouble(reader.readLine());
            System.out.println("Параметр а = " + a);
            double b = Double.parseDouble(reader.readLine());
            System.out.println("Параметр b = " + b);
            double c = Double.parseDouble(reader.readLine());
            System.out.println("Параметр c = " + c);

            double discriminanta = Math.pow(b, 2) - 4*a*c;
            double x1, x2;

            if (discriminanta > 0) {
                x1 = (-b + Math.sqrt(discriminanta)) / (2*a);
                x2 = (-b - Math.sqrt(discriminanta)) / (2*a);
                System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
            }

            if (discriminanta == 0) {
                x1 = -(b/(2*a));
                System.out.println("Корни уравнения: x1 = x2 = " + x1);
            }

            if (discriminanta < 0) {
                System.out.println("У квадратного уравнения с такими параметрами нет корней");
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
