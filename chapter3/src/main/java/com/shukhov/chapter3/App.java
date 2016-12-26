package com.shukhov.chapter3;


import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {

        //Создание матрицы с введенной с консоли размерностью (n), которая заполняется рандомными числами от -n до n
        MatrixMaxValuesToDiagonal matrix = new MatrixMaxValuesToDiagonal();
        //Вывод значений матрицы в консоль
        matrix.printMatrix();
        //Сортировка созданной матрицы. Перестановка макс значений матрицы сверху вниз по диагонали.
        matrix.sortMaxToDiagonal();
        matrix.printMatrix();
        //Сортировка созданной матрицы. Перестановка столбцов по убыванию их характеристик слева направо.
        matrix.sortColumnsDes();
        matrix.printMatrix();

    }
}
