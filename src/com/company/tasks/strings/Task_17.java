package com.company.tasks.strings;

import java.util.Scanner;

public class Task_17 {
      //Two strings, a and b, are called anagrams if they contain
     // all the same characters in the same frequencies.
    // For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

    static boolean isAnagram(String a, String b) {

        char[] s1 = a.toLowerCase().toCharArray();
        char[] s2 = b.toLowerCase().toCharArray();
        // if length of strings is not same
        if (s1.length != s2.length)
            return false;
        int[] arr = new int['Z'];
        for (int i = 0; i < s1.length; i++){
            arr[s1[i]-'A']++;
            arr[s2[i]-'A']--;
        }
        for (int i = 0; i<'Z'; i++)
            if (arr[i] != 0)
                return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
