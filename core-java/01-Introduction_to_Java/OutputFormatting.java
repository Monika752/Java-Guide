// Refer README.md for explanation of the formatting tags.
// Here are some examples of formatting output in Java using printf and format methods.

public class OutputFormatting {
    public static void main(String[]args){

        // 1. Print your name, age and city using printf(),
        String name = "Monika";
        int age = 25;
        String city = "Chennai";
        System.out.println("------------------Example : 1---------------------------------");
        System.out.printf("My name is %s, I am %d years old and I'm from %s.%n", name, age, city);
        System.out.println("--------------------------------------------------------------");

        // 2. print the value of pi with exactly 3 decimal places.
         System.out.println("------------------Example : 2---------------------------------");
        double pi = 3.14159265359;
        System.out.printf("Value of pi is : %.3f %n",pi);
        System.out.println("--------------------------------------------------------------");



        // 3. Print the number 45 with a width of 6.
         System.out.println("------------------Example : 3---------------------------------");
        System.out.printf("The value of 45 with width of 6 : |%6d| %n",45);
        System.out.println("--------------------------------------------------------------");



        // 4. Print the number 45 left-aligned ina width of 6.
         System.out.println("------------------Example : 4---------------------------------");
        System.out.printf("Left aligned value, width of 6 : |%-6d| %n",45);
        System.out.println("--------------------------------------------------------------");



        // 5. Print the number 45 with leading zeros to make it 5 digits.
        System.out.println("------------------Example : 5---------------------------------");
        System.out.printf("45 with leading zeros of 5 digits : %05d %n",45);
        System.out.println("--------------------------------------------------------------");



        // 6. Print a table of 3 students with columns: Name, Age, Marks.
        System.out.println("------------------Example : 6---------------------------------");
        System.out.printf("%-10s %-5s %-10s %n","Name","Age","Marks");
        System.out.printf("%-10s %-5d %-10.2f %n","Monika",21,98.45);
        System.out.printf("%-10s %-5d %-10.2f %n","Keerthana",19,95.45);
        System.out.printf("%-10s %-5d %-10.2f %n","Rahul",22,88.45);
        System.out.println("--------------------------------------------------------------");


        // 7. print the discount message of 25%.
        System.out.println("------------------Example : 7---------------------------------");
        System.out.printf("Discount : %d%% %n",25);
        System.out.println("--------------------------------------------------------------");


        // 8. Print the hexadecimal and octal representation of the number 255.
        System.out.println("------------------Example : 8---------------------------------");
        System.out.printf("Hexadecimal of 255 : %x %n",255);
        System.out.printf("Octal of 255 : %o %n",255);
        System.out.println("--------------------------------------------------------------");


        // 9. print a salary value of 56789.9876 rounded to 2  decimal places.
        System.out.println("------------------Example : 9---------------------------------");
        System.out.printf("Salary value : %.2f %n",56789.9876);
        System.out.println("--------------------------------------------------------------");


        // 10. create a formatted employee report with columns ID, Name, Department and salary.
        System.out.println("------------------Example :10---------------------------------");
        System.out.printf("%-5s %-10s %-12s %-8s %n","ID","Name","Department","Salary");
        System.out.printf("%-5d %-10s %-12s %-8.2f %n",101,"Mohan","Sales",12000.00);
        System.out.printf("%-5d %-10s %-12s %-8.2f %n",102,"Mani","Manager",25000.00);
        System.out.printf("%-5d %-10s %-12s %-8.2f %n",103,"Rahul","Analyst",20000.00);
        System.out.printf("%-5d %-10s %-12s %-8.2f %n",101,"Manisha","HR",15000.99);
        System.out.printf("%-5d %-10s %-12s %-8.2f %n",101,"Anish","Creator",18000.89);
        System.out.println("--------------------------------------------------------------");

    }
}
