package com.tremend.practice;

import java.util.Scanner;

public class SpecificValueInArray {

    static int[] arr = {11,22,33,44,55};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Da-mi valoarea pe care sa o verific daca exista in sirul meu: ");
        int i = scanner.nextInt();

        for (int a: arr ) {
            if(a == i) {
                System.out.println("Sirul contine numarul specificat!");
                System.exit(0);
            }
        }

        System.out.println("Nu am gasit numarul in sir");
    }
}
