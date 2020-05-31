package com.company.tasks.BigNumber;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Task_25 {
    //Java Primality Test
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String a=scanner.nextBigInteger().isProbablePrime(1)?"prime" : "not prime";
        System.out.println(a);

        scanner.close();
    }
}
