// Programmers: Jake, Amari
// Course: CS 212
// Due Date: 2/11/2024
// Lab Assignment: 3
// Problem Statement: Develop a program that acts at a smart ATM.
// Data In: Name, user's choice, withdraw/deposit amount, receipt choice
// Data Out: Net change in account balance, current account balance
// Credits: N/A

import java.util.Scanner; // Import Scanner utility
import java.text.DecimalFormat; // Import DecimalFormat text

class Lab3 { // Create Lb 3 class
    public static void main(String[] args) { // Create main method
        // Create necessary objects
        Scanner scan = new Scanner(System.in);
        DecimalFormat money = new DecimalFormat("$0.00");

        // Prompt user for name, save as string name
        System.out.println("Welcome to Lab 3");
        System.out.println("What is your name?");
        String name = scan.nextLine();

        double accountBalance = 212.90; // Initialize double accountBalance as 212.90
        int leave = 0; // Initialize int leave as 0

        while (leave==0) { // While user doesn't choose "leave"
            // Welcome user using their name and ask what they would like to do, save as string choice
            System.out.println("Welcome " + name + " Would you like to deposit, withdraw, check balance, or leave?");
            String choice = scan.nextLine();

            if (choice.equalsIgnoreCase("deposit")){ // If choice is "deposit"
                // Ask user how much to deposit, save as double deposit
                System.out.println("How much would you like to deposit?");
                int deposit = scan.nextInt();
                accountBalance += deposit; // Add deposit to accountBalance, replace accountBalance value with result

            }else if (choice.equals("withdraw")){ // Otherwise if choice is "withdraw"
                // Ask user how much to withdraw, save as double withdraw
                System.out.println("How much would you like to withdraw?");
                double withdraw = scan.nextInt();
                accountBalance -= withdraw; // Subtract withdraw from accountBalance, replace accountBalance value with result

            }else if (choice.equals("check balance")){ // Otherwise if choice is "check balance"
                System.out.println(accountBalance); // Output current accountBalance

            }else if (choice.equals("leave")){ // Otherwise if choice is "leave"
                leave = 1; // int leave becomes 1

            }else{ // In all other cases (error check)
                System.out.print("Invalid input, try again."); // Tell user their input is invalid and to try again, replace choice with user input

            } // End of if... else statement
        } // End of while loop

        System.out.println("Would you like your receipt printed or emailed to you?: ");
        String receiptChoice = scan.nextLine();

        if(receiptChoice.toLowerCase().equals("printed")){
            System.out.println("You finished your transaction with a balance of" + money.format(accountBalance) + ". ");
        }


    } // End of main method
} // End of Lab 3 class
