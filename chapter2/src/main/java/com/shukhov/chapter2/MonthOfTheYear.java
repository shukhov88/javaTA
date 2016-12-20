package com.shukhov.chapter2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Задача № 4, Вариант В (Глава 2).
* Вывод названия месяца по номеру.
*/

public class MonthOfTheYear {

    public static void printMonth() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int monthsNum = 0;

        System.out.println("Введи номер месяца:");

        try {

            monthsNum = Integer.parseInt(reader.readLine());

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            try {

                reader.close();

            } catch (IOException io) {

                System.out.println(io);

            }
        }

        switch (monthsNum) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Вы ввели не существующий месяц. Допустимые значения для ввода: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12");
                break;
        }

    }
}
