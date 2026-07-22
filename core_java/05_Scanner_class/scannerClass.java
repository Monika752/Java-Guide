// refer the README.md file for the explanation of the Scanner class and String concatenation.
// here are some of the examples of the Scanner class and String concatenation.

import java.util.Scanner; // Step1 : importing the Scanner class from the java.util package.

public class scannerClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Step2 : creating an object of the Scanner class.

        // 1. Build a simple student information program that reads Name, roll number, department, and CGPA of a student from the user and prints them in a formatted output.
        System.out.println("Enter student's name: ");
        String name = sc.nextLine();
        System.out.println("Enter student's roll number: ");
        String rollNo = sc.nextLine(); 
        System.out.println("Enter student's department: ");
        String dept = sc.nextLine();
        System.out.println("Enter student's CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("-----------Student Information--------------");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Department: " + dept);
        System.out.println("CGPA: " + cgpa);
        System.out.println("--------------------------------------------");


        // 2. Build a basic calculator using Scanner that reads two numbers and prints all arithmetic operations.

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("-----------Arithmetic Operations--------------");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.printf("Division : %.2f\n", (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
        System.out.println("-------------------------------------  -------");


        // 3. Create a personal profile program that asks for name, age, city, mobile number, and email and print them neatly.

        System.out.println("Enter your name: ");
        String userName = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt(); sc.nextLine(); // consume the newline character
        System.out.println("Enter your city: ");
        String city = sc.nextLine();
        System.out.println("Enter your mobile number: ");
        String mobile = sc.nextLine();
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        System.out.println("-----------Personal Profile--------------");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Mobile Number: " + mobile);
        System.out.println("Email: " + email);
        System.out.println("------------------------------------------");


        // 4. Build a bill generator that reads product name, quantity, and price of a product from the user and prints the total bill.
        System.out.println("Enter product name: ");
        String productName = sc.nextLine();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        double totalBill = quantity * price;
        System.out.println("-----------Bill Generator--------------");
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Bill: " + totalBill);
        System.out.println("---------------------------------------");


        // 5. performs string concatenation using all the different methods of concatenation and prints the output.
        String str1 = "Hello";
        String str2 = "World";
        char ch1 = 'A';
        char ch2 = 'B';
        int no1 = 10;
        int no2 = 20;
        double d1 = 10.5;
        double d2 = 20.5;
        System.out.println("-----------String Concatenation--------------");
        System.out.println("String + String : " + (str1 + str2));
        System.out.println("String + char : " + (str1 + ch1));
        System.out.println("String + int : " + (str1 + no1));
        System.out.println("String + double : " + (str1 + d1));
        System.out.println("char + String : " + (ch1 + str1));
        System.out.println("char + char : " + (ch1 + ch2));
        System.out.println("char + int : " + (ch1 + no1));
        System.out.println("char + double : " + (ch1 + d1));
        System.out.println("int + String : " + (no1 + str1));
        System.out.println("int + char : " + (no1 + ch1));
        System.out.println("int + int : " + (no1 + no2));
        System.out.println("int + double : " + (no1 + d1));
        System.out.println("double + String : " + (d1 + str1));
        System.out.println("double + char : " + (d1 + ch1));
        System.out.println("double + int : " + (d1 + no1));
        System.out.println("double + double : " + (d1 + d2));
        System.out.println("---------------------------------------------");


        sc.close();
    }
}