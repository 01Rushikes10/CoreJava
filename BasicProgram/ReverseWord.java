package com.assignment1.itpreneurpune;

// 18. Write a  java program that accept a word from the user and reverse it.

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String reversedWord = reverseWord(word);
        System.out.println("Reversed word: " + reversedWord);
    }

    public static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }

        return reversed.toString();
    }
}
