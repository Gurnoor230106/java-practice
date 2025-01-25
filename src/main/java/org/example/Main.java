package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans;
        for (int i = 1; i <= 8; i++) {
            System.out.print("Enter a number (0-99): ");
            int number = scanner.nextInt();
            if (number < 0 || number > 99) {
                System.out.println("Please enter a number between 0 and 99.");
                return;
            }

            System.out.print("The number in words is: ");

            if (number == 0) {
                System.out.println("zero");
            } else if (number < 20) {
                printUnit(number);
            } else {
                printTens(number / 10);
                if (number % 10 != 0) {
                    System.out.print(" ");
                    printUnit(number % 10);
                }
                System.out.println();
            }
            System.out.println("If You Want To Continue Press 1 , If Not Press 2");
            ans = scanner.nextInt();
            if (ans == 1) {
                i = 1;
            } else {
                System.out.println("Thank You");
                break;
            }
        }
    }

    public static void printUnit(int number) {
        switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            case 11:
                System.out.println("eleven");
                break;
            case 12:
                System.out.println("twelve");
                break;
            case 13:
                System.out.println("thirteen");
                break;
            case 14:
                System.out.println("fourteen");
                break;
            case 15:
                System.out.println("fifteen");
                break;
            case 16:
                System.out.println("sixteen");
                break;
            case 17:
                System.out.println("seventeen");
                break;
            case 18:
                System.out.println("eighteen");
                break;
            case 19:
                System.out.println("nineteen");
                break;
        }
    }

    public static void printTens(int number) {
        switch (number) {
            case 2:
                System.out.print("twenty");
                break;
            case 3:
                System.out.print("thirty");
                break;
            case 4:
                System.out.print("forty");
                break;
            case 5:
                System.out.print("fifty");
                break;
            case 6:
                System.out.print("sixty");
                break;
            case 7:
                System.out.print("seventy");
                break;
            case 8:
                System.out.print("eighty");
                break;
            case 9:
                System.out.print("ninety");
                break;

        }
    }
}