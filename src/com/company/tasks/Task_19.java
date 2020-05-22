package com.company.tasks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task_19 {
    // In this problem, a regex is only valid if you can compile it
    // using the Pattern.compile method.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();

           try {
               Pattern.compile(pattern);
               System.out.println("Valid");
               testCases--;
           }catch (Exception ex){
               System.out.println("Invalid");
               testCases--;
           }
        }
    }
}
