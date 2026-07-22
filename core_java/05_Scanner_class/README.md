# Scanner Class in Java

The `Scanner` class is used to take input from the user through the keyboard.

It belongs to the `java.util` package.

```java
import java.util.Scanner;
```

---

# Creating a Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

- `Scanner` → Class name
- `sc` → Object name
- `System.in` → Standard input (keyboard)

---

# Common Scanner Methods

| Method | Description | Example |
|---------|-------------|----------|
| next() | Reads one word | sc.next() |
| nextLine() | Reads an entire line | sc.nextLine() |
| nextInt() | Reads an integer | sc.nextInt() |
| nextDouble() | Reads a decimal number | sc.nextDouble() |
| nextFloat() | Reads a float | sc.nextFloat() |
| nextLong() | Reads a long value | sc.nextLong() |
| nextBoolean() | Reads true or false | sc.nextBoolean() |

---

# Example

```java
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

        sc.close();
    }
}
```

---

# Why close()?

```java
sc.close();
```

Closes the Scanner object and releases the resources after use.

---

# String Concatenation using '+' Operator

The `+` operator joins two or more strings.

```java
String firstName = "Monika";
String lastName = "S";

System.out.println(firstName + " " + lastName);
```

Output

```
Monika S
```

---

# Concatenating Variables

```java
int age = 21;

System.out.println("Age : " + age);
```

Output

```
Age : 21
```

---

# Concatenating Multiple Values

```java
String name = "John";
int age = 25;
double salary = 35000.50;

System.out.println("Name : " + name + ", Age : " + age + ", Salary : " + salary);
```

Output

```
Name : John, Age : 25, Salary : 35000.5
```

---

# How '+' Works

```java
System.out.println(10 + 20);
```

Output

```
30
```

Since both operands are numbers, Java performs addition.

---

```java
System.out.println("10" + "20");
```

Output

```
1020
```

Both operands are strings, so Java concatenates them.

---

```java
System.out.println("Age : " + 20);
```

Output

```
Age : 20
```

If one operand is a string, the remaining values are converted into strings automatically.

---

```java
System.out.println('A' + 20);
```

Output

```
Age : 85
```

If one operand is a char, the remaining values are not strings, then it will be added with their ASCII Value. Eg. ASCII value of 'A' is 65 added with 20.

---

# Important Examples

### Example 1

```java
System.out.println(10 + 20 + "Java");
```

Output

```
30Java
```

---

### Example 2

```java
System.out.println("Java" + 10 + 20);
```

Output

```
Java1020
```

---

### Example 3

```java
System.out.println("Result : " + 10 + 20);
```

Output

```
Result : 1020
```

---

### Example 4

```java
System.out.println("Result : " + (10 + 20));
```

Output

```
Result : 30
```

Parentheses are evaluated first.

---

# Scanner with Concatenation Example

```java
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("Welcome " + name);
        System.out.println("You are " + age + " years old.");

        sc.close();
    }
}
```

---

# Best Practices

✔ Import `java.util.Scanner`

✔ Create only one Scanner object for `System.in`

✔ Close the Scanner after use

✔ Use `nextLine()` for full sentences

✔ Use parentheses when combining arithmetic and strings

```java
System.out.println("Total = " + (a + b));
```

instead of

```java
System.out.println("Total = " + a + b);
```

---

# Example Programs

👉 **Examples:**  
`https://github.com/Monika752/Java-Guide/blob/main/core_java/05_Scanner_class/scannerClass.java`
