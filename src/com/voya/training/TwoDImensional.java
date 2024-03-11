package com.voya.training;

import java.util.Scanner;

public class TwoDImensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] marks = new int[row][column];

        System.out.println(marks[0][0]);
        System.out.println(marks.length);

        // populating
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j]= sc.nextInt();
            }
        }
        // printing using for-each loop
        for(int[] one : marks){
            for (int two : one){
                System.out.print(two+" ");
            }
            System.out.println();
        }
    }
}
