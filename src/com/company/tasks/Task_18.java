package com.company.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task_18 {
    //Java String Tokens
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] items = s.trim().split("[ !,?.\\_'@]+");

        if(s.trim().length()==0)
            System.out.println("0");
        else if(s.length() >4*Math.pow(10,5))
            return;
        else
            System.out.println(items.length);

        for(String item: items){
            System.out.println(item);
        }


        scan.close();
        }
}
