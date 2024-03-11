package com.voya.training;

import java.util.Scanner;

public class GreaterTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt(), b= sc.nextInt(), c= sc.nextInt();
        int largest;
        largest=c > (a>b?a:b) ? c: (a>b)?a:b;
        System.out.println(largest);

        // OR
        String s = (a>b&&a>c) ? "a is greater": b>c ? "b is greater" : "c is greater";
        System.out.println(s);
    }
}
