package org.example.praticeprogram;

import java.util.Scanner;

public class Isvowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");


        char ch = scanner.next().charAt(0);

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

            System.out.println( ch + " is vowel");

        }else {
            System.out.println(ch + " is  not vowel");

        }

    }
}
