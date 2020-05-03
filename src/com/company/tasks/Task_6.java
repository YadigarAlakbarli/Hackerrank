package com.company.tasks;

import java.util.Scanner;

public class Task_6 {
   /*
   Given an integer,N , print its first 10  multiples. Each multiple  Nxi (where 1<=1<=10)
   hould be printed on a new line in the form: Nxi=result
    */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(String.format("%d x %d = %d",N,i,i*N));
        }
        scanner.close();
    }
}
