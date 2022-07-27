package com.tremend.practice;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class RegexReplacement {

    static String sampleString = "The quick brown fox jumps over the lazy dog.";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please input sample string (default: %s): ", sampleString);
        String sample = scanner.nextLine();
        if(StringUtils.isEmpty(sample)) {
            System.out.println("Using default sample text");
            sample = sampleString;
        }
        System.out.print("Input regex: ");
        String regex = scanner.next();
        System.out.print("Input replacement: ");
        String replacement = scanner.next();

        System.out.print(sample.replaceAll(regex, replacement));


    }
}
