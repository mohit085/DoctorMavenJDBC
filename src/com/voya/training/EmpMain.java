package com.voya.training;

import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee1 = new Employee();
        employee1.ename="mohit";
        employee1.eid=85;
        employee1.salary=22345.89;

        System.out.println("Name :"+employee1.ename);
        System.out.println("ID :"+employee1.ename);
        System.out.println("Salary :"+employee1.salary);

        Employee employee2 = employee1;
        System.out.println("Name :"+employee1.ename);
        System.out.println("Name :"+employee2.ename);

        employee2.ename ="sahil";
        System.out.println("Name :"+employee1.ename);
        System.out.println("Name :"+employee2.ename);

        employee1.ename=null;
        System.out.println("Name :"+employee1.ename);
        System.out.println("Name :"+employee2.ename);

    }
}
