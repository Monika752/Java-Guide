// refer README.md file for explanation of decision making statements.
// here are some examples for else if ladder statements.

import java.util.Scanner;

public class else_if_ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * / 1. 1. Grade Calculator
         * Write a Java program to calculate the grade based on the marks.
         * 90–100 → Grade A
         * 75–89 → Grade B
         * 60–74 → Grade C
         * 35–59 → Grade D
         * Below 35 → Fail
         */
        System.out.println("----------------------Grade Calculator--------------------");
        System.out.println("Enter marks :");
        int marks = sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("Grade B");
        } else if (marks >= 60 && marks < 75) {
            System.out.println("Grade C");
        } else if (marks >= 35 && marks < 60) {
            System.out.println("Grade D");
        } else if (marks < 35) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }
        System.out.println("----------------------------------------------------------");

        // 2. Write a program to find the largest among three numbers.
        System.out.println("----------------Largest Among Three Numbers--------------");
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }
        System.out.println("----------------------------------------------------------");

        /*
         * Write a program to display the tax category based on annual income.
         * 
         * Below ₹2,50,000 → No Tax
         * ₹2,50,000 – ₹5,00,000 → 5%
         * ₹5,00,001 – ₹10,00,000 → 20%
         * Above ₹10,00,000 → 30%
         */

        System.out.println("----------------------Tax Category--------------------");
        System.out.println("Enter annual income :");
        double income = sc.nextDouble();
        if (income < 250000) {
            System.out.println("No Tax");
        } else if (income >= 250000 && income <= 500000) {
            System.out.println("Tax Category: 5%");
        } else if (income >= 500001 && income <= 1000000) {
            System.out.println("Tax Category: 20%");
        } else {
            System.out.println("Tax Category: 30%");
        }
        System.out.println("----------------------------------------------------------");

        /*
         * Write a program that accepts a number (1–7) and prints the corresponding day.
         * 
         * 1 → Monday
         * 2 → Tuesday
         * ...
         * 7 → Sunday
         * 
         * If the number is not between 1 and 7, print "Invalid day."
         */
        System.out.println("----------------------Day of the Week--------------------");
        System.out.println("Enter a number (1-7) :");
        int day = sc.nextInt();
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day.");
        }
        System.out.println("----------------------------------------------------------");

        /*
         * Write a program to display the electricity tariff based on units consumed.
         * 
         * 0–100 → Free
         * 101–200 → ₹2 per unit
         * 201–500 → ₹5 per unit
         * Above 500 → ₹8 per unit
         */
        System.out.println("----------------------Electricity Tariff--------------------");
        System.out.println("Enter units consumed :");
        int units = sc.nextInt();
        if (units >= 0 && units <= 100) {
            System.out.println("Electricity Tariff: Free");
        } else if (units >= 101 && units <= 200) {
            System.out.println("Electricity Tariff: Rs.2 per unit");
        } else if (units >= 201 && units <= 500) {
            System.out.println("Electricity Tariff: Rs.5 per unit");
        } else if (units > 500) {
            System.out.println("Electricity Tariff: Rs.8 per unit");
        } else {
            System.out.println("Invalid units consumed.");
        }
        System.out.println("----------------------------------------------------------");

        /*
         * Write a program to classify a person's age.
         * 
         * 0–12 → Child
         * 13–19 → Teenager
         * 20–59 → Adult
         * 60 and above → Senior Citizen
         */
        System.out.println("----------------------Age Classification--------------------");
        System.out.println("Enter age :");
        int personAge = sc.nextInt();
        if (personAge >= 0 && personAge <= 12) {
            System.out.println("Child");
        } else if (personAge >= 13 && personAge <= 19) {
            System.out.println("Teenager");
        } else if (personAge >= 20 && personAge <= 59) {
            System.out.println("Adult");
        } else if (personAge >= 60) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Invalid age entered.");
        }
        System.out.println("----------------------------------------------------------");

        /*
         * Write a program that accepts:
         * 
         * Two numbers
         * An operator (+, -, *, /)
         * 
         * Use an else-if ladder to perform the selected operation.
         */
        System.out.println("----------------------Simple Calculator--------------------");
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator entered.");
        }
        System.out.println("----------------------------------------------------------");

        sc.close();
    }
}
