package org.example.praticeprogram;

import java.util.Scanner;

//print 1 10 2 9 3 8 4 7 5 6
public class Mixnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        while (start <= end) {
//            System.out.print(" " +start + "  " + end);
//            start++;
//            end--;

//        for( int i=1,j=10; i<=5;i++,j--){
//            System.out.print(i+" "+j);
//        }

int num = sc.nextInt();
int num2 = sc.nextInt();
        for( int i=num,j=num2; i<=num2;i++,j--) {
            System.out.print(" " +i + " " + j);
        }
    }
}
