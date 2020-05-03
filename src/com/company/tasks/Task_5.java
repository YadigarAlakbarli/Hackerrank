package com.company.tasks;

import java.util.Scanner;

public class Task_5 {
    /*
   Input Format
   Every line of input will contain a String followed by an integer.
   Each String will have a maximum of  10 alphabetic characters, and each integer
   will be in the inclusive range from 0 to 999

   Output Format

   In each line of output there should be two columns:
   The first column contains the String and is left justified using exactly 15
   characters.
   The second column contains the integer, expressed in exactly 3
   digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            String x2;
            if (s1.length() <= 10 && (x >= 0 && x <= 999)) {
                StringBuilder sb = new StringBuilder(s1);
                while (sb.length() < 15) {
                    sb.append(" ");
                }
                if (x >= 100) {
                    x2 = String.valueOf(x);
                } else if (x < 10) {
                    x2 = "00" + String.valueOf(x);
                } else {
                    x2 = "0" + String.valueOf(x);
                }

                System.out.println(sb + x2);
            }
        }
        System.out.println("================================");
    }
}
