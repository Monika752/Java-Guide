// Refer README.md for explanation of the datatypes in java.
// Here are some examples for datatypes in Java.

public class datatypesExample {
    public static void main(String[] args) {
        
        // 1. Create variables of all 8 primitive data types and print them.
        byte b = 100;
        short s = 850;
        int i = 43942;
        long l = 123456789L;
        float f = 9.121f;
        double d = 3.14159;
        char c = 'S';
        boolean bool = true;

        System.out.println("----------------------Example 01 ----------------------");
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Integer value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Character value: " + c);
        System.out.println("Boolean value: " + bool);
        System.out.println("-------------------------------------------------------");

        // 2. Store your personal details (name, age, height, grade, and whether you're a student) using appropriate data types.
        String name = "Monika";
        int age = 21;
        float height = 5.5f;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println("----------------------Example 02 ----------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
        System.out.println("-------------------------------------------------------");

        // 3. Write a program that demonstrates widening conversion (int → double).
        int num = 42;
        double updatedNum = num; // Widening conversion
        System.out.println("----------------------Example 03 ----------------------");
        System.out.println("Original Integer: " + num);
        System.out.println("After Widening Conversion to Double: " + updatedNum);
        System.out.println("-------------------------------------------------------");


        // 4. Write a program that demonstrates narrowing conversion (double → int).
        double num1 = 9.75;
        int num2 = (int) num1; // Narrowing conversion
        System.out.println("----------------------Example 04 ----------------------");
        System.out.println("Original Double: " + num1);
        System.out.println("After Narrowing Conversion to Integer: " + num2);
        System.out.println("-------------------------------------------------------");


        // 5. Print the minimum and maximum values of all integer primitive data types using wrapper classes like Byte.MIN_VALUE and Integer.MAX_VALUE.

        System.out.println("----------------------Example 05 ----------------------");
        System.out.println("Byte Min Value: " + Byte.MIN_VALUE);
        System.out.println("Byte Max Value: " + Byte.MAX_VALUE);
        System.out.println("Short Min Value: " + Short.MIN_VALUE);
        System.out.println("Short Max Value: " + Short.MAX_VALUE);
        System.out.println("Integer Min Value: " + Integer.MIN_VALUE);
        System.out.println("Integer Max Value: " + Integer.MAX_VALUE);
        System.out.println("Long Min Value: " + Long.MIN_VALUE);
        System.out.println("Long Max Value: " + Long.MAX_VALUE);
        System.out.println("-------------------------------------------------------");
    }
}