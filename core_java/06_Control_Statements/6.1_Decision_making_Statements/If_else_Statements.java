// refer readme.md file for explanation of decision making statements. 
// here are some examples for if else statements.

import java.util.Scanner;

public class If_else_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Write a Java program to check whether a number is positive or negative.
        System.out.println("----------------------Example 01--------------------");
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + " is positive");
        } else {
            System.out.println(num + " is negative");
        }
        System.out.println("----------------------------------------------------");


        // 2. Write a program to check whether a person is eligible to vote (age ≥ 18).
        System.out.println("----------------------Example 02--------------------");
        System.out.println("Enter age :");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        System.out.println("----------------------------------------------------");


        // 3. Write a program to check whether a number is even or odd.
        System.out.println("----------------------Example 03--------------------");
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even ");
        } else {
            System.out.println(number + " is odd ");
        }
        System.out.println("----------------------------------------------------");


        // 4. Write a program to check whether a student has passed or failed. A student passes if the mark is 35 or above.
        System.out.println("----------------------Example 04--------------------");
        System.out.println("Enter mark :");
        int marks = sc.nextInt();
        if(marks >= 35){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        System.out.println("----------------------------------------------------");


        // 5. Write a program to check whether a number is divisible by 5 or not.
        System.out.println("----------------------Example 05--------------------");
        System.out.println("Enter a number : ");
        int entered_number = sc.nextInt();
        if(entered_number % 5 == 0){
            System.out.println(entered_number + " is divisible by 5");
        } else {
            System.out.println(entered_number + " is not divisible by 5");
        }
        System.out.println("----------------------------------------------------");


        // 6. Write a program to check whether a character is an uppercase English letter or not.
        System.out.println("----------------------Example 06--------------------");
        System.out.println("Enter a Character : ");
        char ch = sc.next().charAt(0);
        if((ch >= 'A') && (ch <= 'Z')){
            System.out.println(ch + " is an Uppercase alphabet");
        } else {
            System.out.println(ch + " is not an Uppercase alphabet");
        }
        System.out.println("----------------------------------------------------");


        // 7. Write a program to find largest number from two numbers.
        System.out.println("----------------------Example 07--------------------");
        System.out.println("Enter first number : ");
        int first_number = sc.nextInt();
        System.out.println("Enter second number : ");
        int second_number = sc.nextInt();
        if(first_number > second_number){
            System.out.println(first_number + " is the largest number");
        } else {
            System.out.println(second_number + " is the largest number");
        }
        System.out.println("----------------------------------------------------");


        // 8. Write a program to check whether a year is a leap year or not.
        System.out.println("----------------------Example 08--------------------");
        System.out.println("Enter a year : ");
        int year = sc.nextInt();
        if(year % 4 == 0){
            System.out.println(year + " is a Leap year");
        } else {
            System.out.println(year + " is not a Leap year");
        }
        System.out.println("----------------------------------------------------");

        sc.close();
    }
}