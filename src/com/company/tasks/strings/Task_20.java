package com.company.tasks.strings;

import java.util.Scanner;

public class Task_20 {

    //IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may
// range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D
// can't be greater than 3.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String from0To255 = "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])";
    public String pattern = String.format("%s.%s.%s.%s", from0To255, from0To255, from0To255, from0To255);
}
