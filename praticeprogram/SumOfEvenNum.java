package org.example.praticeprogram;

import java.util.Scanner;

public class SumOfEvenNum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i=0; i<=num; i++) {
            if (i%2==0) {

                 sum=sum+i;

        }

        }
        System.out.println(sum);
    }
}
