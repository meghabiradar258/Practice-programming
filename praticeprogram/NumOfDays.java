package org.example.praticeprogram;

import java.util.Scanner;

//number of days in month
public class NumOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number /MONTH ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" 31 days");
                break;
            case 2:
                    System.out.println("February 28/29 days");
                    break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("March 30 days");
                    break;

default:
    System.out.println("Invalid month");
    break;


        }
    }
}
