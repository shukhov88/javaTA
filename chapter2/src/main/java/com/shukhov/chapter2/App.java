package com.shukhov.chapter2;


import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {

        //QuadraticEquation.getRoots();
        //MonthOfTheYear.printMonth();
        int[][] matrix = MatrixMaxValuesToDiagonal.initMatrix();
        MatrixMaxValuesToDiagonal.printMatrix(matrix);
        MatrixMaxValuesToDiagonal.sortMaxToDiagonal(matrix);
        MatrixMaxValuesToDiagonal.printMatrix(matrix);


    }

}
