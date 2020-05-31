package com.company.tasks.strings;

import java.text.ChoiceFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Task_12 {

//Each line contains the value of payment formatted according
// to the four countries' respective currencies.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String india=NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " +india );
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
