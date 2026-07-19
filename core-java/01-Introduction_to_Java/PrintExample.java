// Java printing statements can be used to display output on the console. The most commonly used printing statements in Java are System.out.print(), System.out.println(), and System.out.printf().

public class PrintExample {
    public static void main(String[] args) {

        // 1. System.out.print() - This method is used to print text to the console without adding a new line at the end. It allows you to print multiple statements on the same line.
        // Example:

        System.out.println("--------Using Print()--------");
        System.out.print("Hello, ");
        System.out.print("World!");

        // using println() for moving to nextLine from the previous line...

        System.out.println();

        // 2. System.out.println() - This method is used to print text to the console adding a new line at the end. It allows you to print multiple statements using new line.
        // Example:

        System.out.println("--------Using Println()--------");
        System.out.println("Hello Techies,");
        System.out.println("Welcome to Java Guide..");

        // 3. System.out.printf() - This method is used to print formatted text to the console. It allows you to format the output using format specifiers.
        // Example:

        System.out.println("--------Using Printf()--------");
        String name = "Monika";
        int age = 21;
        System.out.printf("My name is %s and I am %d years old.", name, age);

    }
}


