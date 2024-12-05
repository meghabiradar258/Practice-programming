package org.example.praticeprogram;

import java.util.Scanner;

public class CheckNumerVisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num>0)
        {
            System.out.println("positive number");

        }
        else if (num<0)
        {
            System.out.println("negative number");
        }
        else {
            System.out.println("zero");
        }

    }

}
