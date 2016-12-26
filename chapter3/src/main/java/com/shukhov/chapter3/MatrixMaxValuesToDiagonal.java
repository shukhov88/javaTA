package com.shukhov.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
* Сортировка матрицы заданной размерности.
* Задачи 19 и 20, Варианта С (Глава 2)
*/

public class MatrixMaxValuesToDiagonal {

    private int [][] matrix;

    //Создание матрицы заданной размерности.
    public MatrixMaxValuesToDiagonal() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int matrixSize = 0;

        try {
            System.out.println("Введи размерность матрицы:");
            matrixSize = Integer.parseInt(reader.readLine());

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                reader.close();
            } catch (IOException io) {
                System.out.println(io);
            }
        }

        matrix = new int [matrixSize] [matrixSize];
        Random randGen = new Random();

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = randGen.nextInt(matrixSize*2 + 1) - matrixSize;
            }
        }
    }

    //Задача № 20, Вариант С (Глава 2): перестановка наибольших значений по диагонали слева вниз по убыванию.
    public void sortMaxToDiagonal() {

        for (int k = 0; k < matrix.length; k++) {

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[k][k] < matrix[i][j]) {
                        if (i!=j || i > k) {
                            int temp = matrix[k][k];
                            matrix[k][k] = matrix[i][j];
                            matrix[i][j] = temp;
                        }
                    }
                }
            }
        }
    }

    //Задача № 19, Вариант С (Глава 2): перестановка столбцов по убыванию их характеристик слева направо.
    //Характеристика столбца = сумма модулей элементов столбца.
    public void sortColumnsDes() {

        for (int i = 0; i < matrix.length-1; i++) {
            int characteristic = 0;
            for (int j = 0; j < matrix.length; j++) {
                 characteristic += Math.abs(matrix[j][i]);
            }

            for (int k = i+1; k < matrix.length; k++) {
                int toCompareWith = 0;
                for (int n = 0; n < matrix.length; n++) {
                    toCompareWith += Math.abs(matrix[n][k]);
                }
                if (characteristic < toCompareWith) {
                    for (int m = 0; m < matrix.length; m++) {
                        int temp = matrix[m][i];
                        matrix[m][i] = matrix[m][k];
                        matrix[m][k] = temp;
                    }
                }
            }
        }
    }

    //Вывод матрицы
    public void printMatrix() {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}
