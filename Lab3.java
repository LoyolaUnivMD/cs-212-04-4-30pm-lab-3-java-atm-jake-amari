// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;

class Lab3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.println("Welcome to Lab 3");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        double accountBalance = 212.90;
        int leave = 0;
        while (leave==0) {
            System.out.println("Welcome " + name + " Would you like to deposit, withdraw, check balance, or leave?");
            String choice = scan.nextLine();
            if (choice.equals("deposit")){
                System.out.println("How much would you like to deposit?");
                int deposit = scan.nextInt();
                accountBalance += deposit;

            }
            else if (choice.equals("withdraw")){
                System.out.println("How much would you like to withdraw?");
                int withdraw = scan.nextInt();
                accountBalance -= withdraw;

        }
            else if (choice.equals("check balance")){
                System.out.println(accountBalance);

    }
            else if (choice.equals("leave")){
                leave = 1;
            }
            else{
                System.out.print("Invalid input, try again.");
            }
}}}
