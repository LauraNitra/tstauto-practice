package com.tremend.practice;

import java.util.Scanner;

public class TheGreatestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int first = scanner.nextInt();
        System.out.print("Input the 2nd number: ");
        int second = scanner.nextInt();
        System.out.print("Input the 3rd number: ");
        int third = scanner.nextInt();

        System.out.println("The greatest: " +Math.max(Math.max(first,second),third));
    }
}
