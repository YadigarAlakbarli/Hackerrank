package com.company.tasks.strings;

import java.util.Scanner;

public class Task_13 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length()+B.length());
        int n=A.compareTo(B);

        if (n <= 0)
            System.out.println("No");
         else
            System.out.println("Yes");

        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) +
                           " "+B.substring(0,1).toUpperCase()+B.substring(1));
    }
}
