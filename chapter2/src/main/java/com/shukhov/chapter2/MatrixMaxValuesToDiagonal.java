package com.shukhov.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
* Задача № 20, Вариант С (Глава 2).
* Сортировка матрицы заданной размерности. Большие числа расположить по диагонали матрицы.
* Эта задача еще не до конца решена!!!
*/


public class MatrixMaxValuesToDiagonal {

    public static int[][] initMatrix() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int matrixSize = 0;
        int [][] matrix;

        try {
            System.out.println("Введи размерность матрицы:");
            matrixSize = Integer.parseInt(reader.readLine());
            reader.close();

        } catch (IOException e) {
            System.out.println(e);
        }

        matrix = new int [matrixSize] [matrixSize];
        Random randGen = new Random();

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = randGen.nextInt(matrixSize*2 + 1) - matrixSize;
            }
        }

        return matrix;
    }

    public static void sortMaxToDiagonal(int[][] matrix) {

        for (int k = 0; k < matrix.length; k++) {

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[k][k] < matrix[i][j]) {
                        if (i!=j || ((i==j) && (i <= k))) {
                            int temp = matrix[k][k];
                            matrix[k][k] = matrix[i][j];
                            matrix[i][j] = temp;
                        }
                    }
                }
            }

        }

    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
