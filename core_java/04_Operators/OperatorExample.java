// Refer README.md for explanation of the operators in java.
// Here are some examples for operators in Java.

public class OperatorExample {
    public static void main(String[] args) {

        // 1. Calculate the area and perimeter of a rectangle.
        int length = 10;
        int breadth = 5;
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println("----------------------Example 01 ----------------------");
        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);
        System.out.println("-------------------------------------------------------");

        // 2. Check whether a number is positive, negative, or zero using the ternary
        // operator.
        int number = -10;
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("----------------------Example 02 ----------------------");
        System.out.println("The number " + number + " is: " + result);
        System.out.println("-------------------------------------------------------");

        // 3. Find the largest of three numbers using relational and logical operators.
        int num1 = 15;
        int num2 = 25;
        int num3 = 10;
        int largest = 0;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        System.out.println("----------------------Example 03 ----------------------");
        System.out.println("The largest number is: " + largest);
        System.out.println("-------------------------------------------------------");

        // 4. Swap two numbers using arithmetic operators.
        int a = 5;
        int b = 10;
        System.out.println("----------------------Example 04 ----------------------");
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        a = a + b; // a now becomes 15
        b = a - b; // b becomes 5
        a = a - b; // a becomes 10
        System.out.println("After Swapping: a = " + a + ", b = " + b);
        System.out.println("-------------------------------------------------------");

        // 5. Predict the output:

        int x = 10;
        int y = 5;
        int z = ++x + y-- - x++ + --y; // z = 11 + 5 - 11 + 3 = 8
        System.out.println("----------------------Example 05 ----------------------");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("-------------------------------------------------------");

        // 6. Write a calculator that performs +, -, *, /, and %.
        int numA = 20;
        int numB = 4;
        System.out.println("----------------------Example 06 ----------------------");
        System.out.println("Addition: " + (numA + numB));
        System.out.println("Subtraction: " + (numA - numB));
        System.out.println("Multiplication: " + (numA * numB));
        System.out.println("Division: " + (numA / numB));
        System.out.println("Modulus: " + (numA % numB));
        System.out.println("-------------------------------------------------------");

        // 7. Check whether a year is a leap year using logical operators.
        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("----------------------Example 07 ----------------------");
        System.out.println("Year " + year + " is a leap year: " + isLeapYear);
        System.out.println("-------------------------------------------------------");

        // 8. Use bitwise operators to calculate 12 & 10, 12 | 10, and 12 ^ 10.
        int numX = 12; // 1100 in binary
        int numY = 10; // 1010 in binary
        System.out.println("----------------------Example 08 ----------------------");
        System.out.println("12 & 10 = " + (numX & numY)); // 1000 in binary = 8
        System.out.println("12 | 10 = " + (numX | numY)); // 1110 in binary = 14
        System.out.println("12 ^ 10 = " + (numX ^ numY)); // 0110 in binary = 6
        System.out.println("-------------------------------------------------------");

        // 9. Convert seconds into hours, minutes, and seconds using / and %.
        int totalSeconds = 3665;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println("----------------------Example 09 ----------------------");
        System.out.println(totalSeconds + " sec is equal to: " + hours + " hours, " + minutes + " minutes, and "
                + seconds + " seconds.");
        System.out.println("-------------------------------------------------------");

        // 10. Predict the output:

        int a1 = 4;
        int b1 = 2;
        System.out.println(a1++ * --b1 + ++a1 % b1--); // 4 * 1 + 6 % 1 = 4 + 0 = 4
        System.out.println(a1);
        System.out.println(b1);
    }
}
