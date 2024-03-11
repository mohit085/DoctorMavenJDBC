package com.voya.training;

import java.util.Scanner;

public class Registrations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String[] name = new String[size];
        for (int i = 0; i < name.length; i++) {
            name[i]= sc.next();
        }
        boolean ispresent = false;
        String username = sc.next();
        for(String usernames : name){
            if(usernames.equalsIgnoreCase(username)){
                System.out.println("Name is not unique");
                ispresent = true;
            }
        }
        if(!ispresent)
            System.out.println("You are registered"+username);
    }
}
