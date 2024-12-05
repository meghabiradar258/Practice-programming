package org.example.praticeprogram;

import java.util.Scanner;

//print number in  1 to 50 divisible by 5 or 3
public class NumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the series of numbers: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
//        {
//            if(i%5==0 || i%3==0){
//                System.out.println(i+" number is divisible by 5 or 3");
//            }
//
//
            if (i%5==0){
                System.out.println(i +"number is divisible by 5 ");

            }else if (i%3==0){
                System.out.println(i +"number is divisible by 3 ");
            }

    }
}
