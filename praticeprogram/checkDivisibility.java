package org.example.praticeprogram;

import java.util.Scanner;

public class checkDivisibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        if(num%5==0)
        {
            System.out.println("Divisible by 5");
        }
        else {
            System.out.println(" not Divisible by 5");
        }
    }
}
