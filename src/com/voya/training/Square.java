package com.voya.training;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] square = new int[size];

        for (int i = 0; i < square.length; i++) {
            System.out.println("Enter the number ");
            System.out.println(square[i]=sc.nextInt());
            System.out.println("The Square of a number");
            System.out.println(square[i]*square[i]);
        }

    }
}
