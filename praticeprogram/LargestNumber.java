package org.example.praticeprogram;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number ");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();

        if(num1>num2)
        {
            System.out.println("num1 is larger than num2");
        } else if (num1<num2) {
            System.out.println("num2 is larger than num1");
        }
else {
    System.out.println("num1 is equal to num2");
        }


    }

}
