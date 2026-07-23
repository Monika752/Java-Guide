// refer readme.md for explanation of the decision making statements in java
// here are some example problems on the topic if statments.

import java.util.Scanner;

public class If_Statements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 1. Write a Java program to check whether a number is positive.
        System.out.println("----------------------Example 01--------------------");
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); 
        if(num > 0){
            System.out.println(num + " is positive");
        }
        System.out.println("----------------------------------------------------");


        // 2. Write a program to check whether a person is eligible to vote (age ≥ 18).
        System.out.println("----------------------Example 02--------------------");
        System.out.println("Enter age :");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are eligible to vote");
        }
        System.out.println("----------------------------------------------------");
        

        // 3. Write a program to check whether a number is even.
        System.out.println("----------------------Example 03--------------------");
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println(number + "is even ");
        }
        System.out.println("----------------------------------------------------");


        // 4. Write a program to check whether a student has passed.A student passes if the mark is 35 or above.
        System.out.println("----------------------Example 04--------------------");
        System.out.println("Enter mark :");
        int marks = sc.nextInt();
        if(marks >= 35){
            System.out.println("Passed");
        }
        System.out.println("----------------------------------------------------");

        
        // 5. Write a program to check whether a number is divisible by 5.
        System.out.println("----------------------Example 05--------------------");
        System.out.println("Enter a number : ");
        int entered_number = sc.nextInt();
        if(entered_number % 5 == 0){
            System.out.println(entered_number + "is divisible by 5");
        }
        System.out.println("----------------------------------------------------");


        // 6. Write a program to check whether a character is an uppercase English letter.
        System.out.println("----------------------Example 06--------------------");
        System.out.println("Enter a Character : ");
        char ch = sc.next().charAt(0);
        if((ch >= 'A') && (ch <= 'Z')){
            System.out.println(ch + "is an Uppercase alphabet");
        }
        System.out.println("----------------------------------------------------");
        

        // 7. Write a program to check whether a number is a three-digit number.
        System.out.println("----------------------Example 07--------------------");
        System.out.println("Enter a number : ");
        int no = sc.nextInt();
        if((no > 99) && (no < 1000)){
            System.out.println(no + "is a three-digit number");
        }
        System.out.println("---------------------------------------------------");


        // 8. Write a program that prints "Possible Leap Year" if the year is divisible by 4.
        System.out.println("----------------------Example 08--------------------");
        System.out.println("Enter a year : ");
        int year = sc.nextInt();
        if(year % 4 == 0){
            System.out.println("Leap year");
        }
        System.out.println("----------------------------------------------------");

        sc.close();
    }
}
