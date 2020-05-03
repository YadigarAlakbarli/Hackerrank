package com.company.tasks;

import java.util.Scanner;

public class Task_8 {
    //Given an input integer,
    // you must determine which primitive data types are capable of properly storing that input
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                if (x >= -Math.pow(2, 16) && x < Math.pow(2, 16) - 1) System.out.println("* short");

                if (x >= -Math.pow(2, 32) && x < Math.pow(2, 32) - 1) System.out.println("* int");

                if (x >= -Math.pow(2, 64) && x < Math.pow(2, 64) - 1) System.out.println("* long");


            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
