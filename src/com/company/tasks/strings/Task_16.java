package com.company.tasks.strings;

import java.util.Scanner;

public class Task_16 {

    //A palindrome is a word, phrase, number,
    // or other sequence of characters which reads the same backward or forward
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int result=0;
        for (int i = 0; i<A.length()/2; i++) {
              if(A.charAt(i)==A.charAt(A.length()-i-1)){
                  result++;
              }
        }
        System.out.println(result==A.length()/2?"Yes":"No");
    }
}
