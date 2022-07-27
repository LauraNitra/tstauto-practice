package com.tremend.practice;

import java.util.Scanner;

public class ConvertMinutes {

    public static void main(String[] args){

                Scanner scanner = new Scanner(System.in);
                int minutes = scanner.nextInt();

//                int minutes = 3456789;

                int hours = minutes / 60;

                int days =  hours / 24;

                int years = days / 365;

                int restDays = days % 365;

                System.out.print(minutes + " is approximatley " + years + " years and " +restDays + " days");
    }
}