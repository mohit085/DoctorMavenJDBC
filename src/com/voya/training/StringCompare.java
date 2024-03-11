package com.voya.training;

import java.util.Objects;
import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        // 1st Method
        if(name.equalsIgnoreCase("mohit"))
            System.out.println("Welcome "+name);
        else
            System.out.println("name not found");

        // 2nd Method
        if(name.compareTo("mohit")==0)
            System.out.println("Welcome "+name);
        else
            System.out.println("name not found");

        // 3rd Method
        String string1 = new String("mohit");
        String string2 = new String("mohit");
        boolean b=Objects.equals(string1,string2);
        System.out.println(b);
    }
}
