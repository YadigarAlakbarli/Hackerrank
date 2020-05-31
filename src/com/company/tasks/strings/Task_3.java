package com.company.tasks.strings;

import java.util.Scanner;

public class Task_3 {
   /* Given an integer, n, perform the following conditional actions:
    If n is odd, print Weird
    If n is even and in the inclusive range of to , print Not Weird
    If n is even and in the inclusive range of to , print Weird
    If is even and greater than , print Not Weird*/

   private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20 && N <= 100) {
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }
}
