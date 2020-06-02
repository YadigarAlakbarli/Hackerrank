package com.company.tasks.arrays;

public class Task_34 {
    //Java 2D Array
         /* 1 1 1 0 0 0
            0 1 0 0 0 0
            1 1 1 0 0 0
            0 0 2 4 4 0
            0 0 0 2 0 0
            0 0 1 2 4 0
            */

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int max=-71;
        int sum=0;
        for (int i = 0; i <arr.length-2 ; i++) {
            for (int j = 0; j <arr.length-2 ; j++) {
                sum=0;
                for (int k = 0; k <3; k++) {
                    sum+=arr[i][j+k]+arr[i+2][j+k];
                    if(k==1)
                        sum+=arr[i+1][j+k];
                }
                if(max<sum)
                    max=sum;

            }
        }

        System.out.println(max);
    }
}
