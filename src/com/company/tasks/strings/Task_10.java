package com.company.tasks.strings;

import java.util.Scanner;

public class Task_10 {
    private static int B,H;
    private static boolean flag=true;
    private static Scanner scanner;
static  {
    scanner=new Scanner(System.in);
    int B=scanner.nextInt();
    int H=scanner.nextInt();
   if (B<0 && H<0){
        new Exception("Breadth and height must be positive");
   }

}
    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
