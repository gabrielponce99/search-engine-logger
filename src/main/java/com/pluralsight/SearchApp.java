package com.pluralsight;

import java.util.Scanner;

public class SearchApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String command;
        do {
            System.out.println("----HOME----");
            System.out.println("""
                    1) Write a file
                    2) Search for a term
                    3) Exit the application""");
            System.out.println("Enter a command: ");
            command = scanner.nextLine().trim();

            switch (command) {
                case "1" -> System.out.println("command = "); //needs to be changed!
                case "2" -> System.out.println(""); //needs to be changed!
                case "3" -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid command. Try again!");
            }
        } while (!command.equals("3"));
    }
}
