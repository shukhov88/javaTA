package com.shukhov.chapter2;


import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {

        //Создание квадратного уравнения с вводом параметров с консоли
        //QuadraticEquation equation = new QuadraticEquation();
        //Выыод в консоль корней созданного уравнения
        //equation.printRoots();

        //Вывод в консоль названия месяца по введенному с консоли номеру месяца
        //MonthOfTheYear.printMonth();

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
