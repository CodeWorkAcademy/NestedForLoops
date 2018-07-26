package com.company;
public class MultiplicationTable {
    static final int MAX = 10;

    public static void main (String[] args) {
        int row, column;

        for (row = 1; row <= MAX; row++) {
            for (column = 1; column <= MAX; column++)
            {
                System.out.print(row * column + "\t");
            }
            System.out.println();//Takes us to the next line
        }
    }
}