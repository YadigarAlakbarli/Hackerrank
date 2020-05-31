package com.company.tasks;

import java.util.Scanner;

public class Task_10 {
    private static int B,H;
    private static boolean flag=true;

    static {
        Scanner scanner=new Scanner(System.in);
        H=scanner.nextInt();
        B=scanner.nextInt();

        if (H<=0  || B<=0){
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
