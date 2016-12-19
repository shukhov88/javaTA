package com.shukhov.chapter2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonthOfTheYear {

    public static void printMonth() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean run = true;

        while (run) {

            try {

                System.out.println("Введи номер месяца:");
                int monthsNum = Integer.parseInt(reader.readLine());

                switch (monthsNum) {
                    case 1:
                        System.out.println("Январь");
                        run = false;
                        break;
                    case 2:
                        System.out.println("Февраль");
                        run = false;
                        break;
                    case 3:
                        System.out.println("Март");
                        run = false;
                        break;
                    case 4:
                        System.out.println("Апрель");
                        run = false;
                        break;
                    case 5:
                        System.out.println("Май");
                        run = false;
                        break;
                    case 6:
                        System.out.println("Июнь");
                        run = false;
                        break;
                    case 7:
                        System.out.println("Июль");
                        run = false;
                        break;
                    case 8:
                        System.out.println("Август");
                        run = false;
                        break;
                    case 9:
                        System.out.println("Сентябрь");
                        run = false;
                        break;
                    case 10:
                        System.out.println("Октябрь");
                        run = false;
                        break;
                    case 11:
                        System.out.println("Ноябрь");
                        run = false;
                        break;
                    case 12:
                        System.out.println("Декабрь");
                        run = false;
                        break;
                    default:
                        System.out.println("Вы ввели не существующий месяц. Допустимые значения для ввода: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12");
                        break;
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }

        reader.close();

    }

}
