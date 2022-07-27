package com.tremend.practice;

import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pentru ce string vrei sa calculez lungimea: ");
        String str = scanner.next();

        System.out.printf("The string length of %s is: %d", str, str.length());

    }
}
