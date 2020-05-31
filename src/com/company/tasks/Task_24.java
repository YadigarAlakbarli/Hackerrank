package com.company.tasks;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task_24 {
    //Java BigDecimal

    public static void main(String[] args) {

        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (new BigDecimal(s[i + 1]).compareTo(new BigDecimal(s[i])) == 1) {
                    String tmp = s[i + 1];
                    s[i + 1] = s[i];
                    s[i] = tmp;
                }
            }
        }


        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
