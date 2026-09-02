// refer readme.md file for explanation of decision making statements.
// here are some examples for nested if statements.

import java.util.Scanner;

public class nested_if_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*  1. Positive & Even
        Write a Java program to check whether a number is:Positive
        If positive, check whether it is even or odd.
        If negative or zero, print "Not a positive number".*/

        System.out.println("----------------------Example 01--------------------");
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        if(num1 > 0){
            if(num1%2 == 0){
                System.out.println(num1 + " is a positive even number.");
            } else {
                System.out.println(num1 + " is a positive odd number.");    
            }
        }else {
            System.out.println(num1 + " is not a positive number.");
        }
        System.out.println("----------------------------------------------------");

        /*  2. Login Validation
         Take a username and password.
         First check whether the username is correct.
         If correct, check whether the password is correct.
         Print "Login successful", "Wrong password", or "Invalid username".*/

        System.out.println("----------------------Example 02--------------------");
        System.out.println("Enter username: ");
        String username = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();

        if (username.equals("admin")) {
            if (password.equals("password")) {
                System.out.println("Login successful");
            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("Invalid username");
        }
        System.out.println("----------------------------------------------------");

        /* 3. Employee Bonus
         An employee receives a bonus only if their performance rating is 4 or above.
         If eligible, check their years of experience.
         If experience is 5+ years → 20% bonus.
         Otherwise → 10% bonus.
         If rating is below 4 → no bonus.*/
        System.out.println("----------------------Example 03--------------------");
        System.out.println("enter ratings /5 :");
        int rating = sc.nextInt();
        System.out.println("enter experience in years :");
        int experience = sc.nextInt();
        if(rating >= 4){
            if(experience >= 5){
                System.out.println("Employee is eligible for 20% bonus.");
            } else {
                System.out.println("Employee is eligible for 10% bonus.");
            }
        } else {
            System.out.println("Employee is not eligible for any bonus.");
        }

        /* 4. ATM Withdrawal
         Write a Java program using nested if statements:
         Check whether the PIN is correct.
         If the PIN is correct, check whether the requested withdrawal amount is available in the account.
         If sufficient balance exists, check whether the amount is a multiple of ₹100.
         If all conditions are satisfied → "Withdrawal successful".
         Otherwise, display the appropriate reason. */
         System.out.println("------------Example 04 -------------------");
         System.out.println("enter PIN :");
         int pin = sc.nextInt();
         int balance = 5000;
         System.out.println("enter withdrawal amount :");
         int withdrawalAmount = sc.nextInt();
         if(pin == 1234){
            if(withdrawalAmount <= balance){
                if(withdrawalAmount % 100 == 0){
                    System.out.println("Withdrawal successful");
                } else {
                    System.out.println("Withdrawal amount must be a multiple of ₹100.");
                }
            } else {
                System.out.println("Insufficient balance.");
            }
         } else {
            System.out.println("Invalid PIN.");
         }

         /* 5. Take a student's marks and attendance percentage.
            If marks are 60 or above:
            Check attendance.
            If attendance is 75% or above → "Eligible for scholarship"
            Otherwise → "Good marks but attendance is insufficient"
            If marks are below 60 → "Not eligible based on marks" */

        System.out.println("------------Example 05 -------------------");
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();
        System.out.println("Enter attendance percentage: ");
        int attendance = sc.nextInt();
        if(marks >= 60){
            if(attendance >= 75){
                System.out.println("Eligible for scholarship");
            } else {
                System.out.println("Good marks but attendance is insufficient");
            }
        } else {
            System.out.println("Not eligible based on marks");
        }

        sc.close();
    }
}
