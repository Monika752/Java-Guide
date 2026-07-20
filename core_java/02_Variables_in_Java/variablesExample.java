// Refer README.md for explanation of the variables in java.
// Here are some examples for declaring and using variables in Java.


public class variablesExample {

    // 9. Static variable - variable created with static keyword and inside the class, method and outside the main method.

    static String College = "ABC University of Education";

    public static void main(String[]args){

        // 1. Declare a variable age and assign your age.
        int age;             // declaration
        age = 21;            // initialization
        System.out.println("My age is : " + age);  // + is used to concatenate the output.
        System.out.println("-------------------------------------------------"); // for better output difference

        // 2. Create variables to store your name, city, and marks.
        String name = "Monika";
        String city = "Chennai";
        double marks = 90.81;
        System.out.println("Name :" + name);
        System.out.println("City :" + city);
        System.out.println("Marks :" + marks);
        System.out.println("-------------------------------------------------");

        // 3. Change the value of a variable and print the updated value.
        int num = 10;
        System.out.println("Original Number : " + num);
        num = 25;
        System.out.println("Updated Number : " + num);
        System.out.println("-------------------------------------------------");

        // 4. Copy the value of one variable into another variable and print both.
        String location = "Chennai";
        String Address = location;
        System.out.println("Location : " + location);
        System.out.println("Address : " + Address);
        System.out.println("-------------------------------------------------");

        // 5. Create three integer variables and print their sum.
        int num1 = 23;
        int num2 = 43;
        int num3 = 63;
        int sum = num1 + num2 + num3;
        System.out.println("Sum of three numbers : " + sum);
        System.out.println("-------------------------------------------------");

        // 6. Initializing the same values of different variables in a single line
        int x, y, z;
        x = y = z = 10;
        System.out.println("Value of x : " + x);
        System.out.println("Value of y : " + y);
        System.out.println("Value of z : " + z);
        System.out.println("-------------------------------------------------");

        // 7. Instance Variable - variable inside class, outside a method.
        String College = "ABC university";  // Instance variable
        System.out.println("Instance variable : " + College);
        System.out.println("-------------------------------------------------");

        // Accessing local variable
        print();

    }

    // 8. local variable - variable inside a method
    public static void print(){
        String msg = "Hello";               // local variable
        System.out.println("Local Variable : " + msg);
        System.out.println("-------------------------------------------------");
    }
}

