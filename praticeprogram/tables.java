package org.example.praticeprogram;

import java.util.Scanner;

//wap to print table of given number
public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){

        System.out.println(i*num);


        }
    }


}
