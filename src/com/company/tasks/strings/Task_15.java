package com.company.tasks.strings;


import java.util.Arrays;
import java.util.Scanner;

public class Task_15 {
    //Java Substring Comparisons
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

    }


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);


        for (int i = 0; i <s.length()-k+1 ; i++) {
            String current = s.substring(i, i + k);

            if(smallest.compareTo(current) > 0) smallest = current;
            if(largest.compareTo(current) < 0) largest = current;
        }

        return smallest + "\n" + largest;
    }
}
