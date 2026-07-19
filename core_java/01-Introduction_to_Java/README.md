# Introduction to Java

This section introduces the fundamentals of Java, its evolution, key features, the Java execution environment, and the different ways of displaying formatted output. These concepts form the foundation for every Java program.

---

## 📚 Table of Contents

- What is Java?
- History of Java
- Features of Java
- JDK vs JRE vs JVM
- Printing Statements in Java
- Output Formatting using `printf()`
- Common Format Specifiers
- Formatting Options
- Practice Examples

---

# What is Java?

Java is a **high-level, object-oriented, class-based programming language** developed by **Sun Microsystems** in 1995 (later acquired by Oracle Corporation). It is designed to be simple, secure, portable, and platform-independent.

Java follows the principle:

> **"Write Once, Run Anywhere (WORA)"**

A Java program is compiled into **bytecode**, which can be executed on any operating system that has a **Java Virtual Machine (JVM)**.

Java is widely used for:

- Web Applications
- Enterprise Applications
- Android Development
- Desktop Applications
- Cloud Computing
- Big Data
- Microservices
- Backend Development

---

# History of Java

- **1991** – The Green Team at Sun Microsystems started developing a language for consumer electronic devices.
- **James Gosling** is known as the **Father of Java**.
- The language was initially named **Oak** after an oak tree outside Gosling's office.
- Since the name "Oak" was already trademarked, it was renamed **Java** in **1995**.
- Oracle Corporation acquired Sun Microsystems in **2010**, and Java has been maintained by Oracle ever since.

---

# Features of Java

Java offers several features that make it one of the most popular programming languages.

| Feature | Description |
|---------|-------------|
| Platform Independent | Runs on any operating system with a JVM |
| Object-Oriented | Supports encapsulation, inheritance, polymorphism, and abstraction |
| Simple | Easy syntax with automatic memory management |
| Secure | No explicit pointers and provides runtime security features |
| Robust | Strong exception handling and automatic garbage collection |
| Multithreaded | Supports concurrent execution of multiple threads |
| Portable | Bytecode can run on different platforms |
| Architecture Neutral | Independent of processor architecture |
| High Performance | Uses Just-In-Time (JIT) compilation |
| Dynamic | Supports runtime loading of classes |

---

# JDK vs JRE vs JVM

Understanding these three components is essential before writing Java programs.

## JVM (Java Virtual Machine)

The **JVM** is responsible for executing Java bytecode.

Responsibilities:

- Loads class files
- Verifies bytecode
- Executes bytecode
- Performs Garbage Collection
- Provides platform independence

Every operating system has its own JVM implementation.

---

## JRE (Java Runtime Environment)

The **JRE** provides everything required to **run** Java applications.

It contains:

- JVM
- Core Java Libraries
- Supporting Files

The JRE **cannot compile** Java programs.

---

## JDK (Java Development Kit)

The **JDK** is used for developing Java applications.

It contains:

- JRE
- JVM
- Java Compiler (`javac`)
- Debugger
- Documentation Tools
- Development Utilities

Developers install the **JDK** to write, compile, and execute Java programs.

---

### Relationship

```
JDK
 ├── JRE
 │     └── JVM
```

---

# Printing Statements in Java

Java provides multiple ways to display output to the console.

## 1. `System.out.print()`

Prints text without moving the cursor to the next line.

Example:

```java
System.out.print("Hello");
System.out.print(" Java");
```

Output

```
Hello Java
```

---

## 2. `System.out.println()`

Prints text and moves the cursor to the next line.

Example

```java
System.out.println("Hello");
System.out.println("Java");
```

Output

```
Hello
Java
```

---

## 3. `System.out.printf()`

Prints formatted output using format specifiers.

Example

```java
System.out.printf("Name: %s Age: %d", "Monika", 22);
```

Output

```
Name: Monika Age: 22
```

---

## 4. `System.out.format()`

Works exactly like `printf()`.

```java
System.out.format("CGPA: %.2f", 8.91);
```

---

# Output Formatting using `printf()`

`printf()` allows developers to display data in a clean and readable format using **format specifiers**.

General syntax:

```java
System.out.printf("format string", values);
```

Example

```java
System.out.printf("Age : %d", 22);
```

---

# Common Format Specifiers

| Specifier | Description | Example |
|-----------|-------------|---------|
| `%d` | Integer | 100 |
| `%f` | Floating Point | 12.56 |
| `%c` | Character | A |
| `%s` | String | Java |
| `%b` | Boolean | true |
| `%x` | Hexadecimal | ff |
| `%o` | Octal | 17 |
| `%e` | Scientific Notation | 1.234e+02 |
| `%n` | New Line | Platform-independent line separator |
| `%%` | Percentage Symbol | % |

---

# Formatting Options

## Decimal Precision

Control the number of digits after the decimal point using `.nf`.

Example

```java
double pi = 3.14159265;

System.out.printf("%.2f", pi);
```

Output

```
3.14
```

---

```java
System.out.printf("%.4f", pi);
```

Output

```
3.1416
```

---

## Width Specification

Specify the minimum field width.

```java
System.out.printf("%10d", 250);
```

Output

```
       250
```

---

## Left Alignment

Use `-` to align the value to the left.

```java
System.out.printf("%-10s", "Java");
```

Output

```
Java
```

---

## Zero Padding

Fill empty spaces with zeros.

```java
System.out.printf("%05d", 25);
```

Output

```
00025
```

---

## Width with Precision

```java
System.out.printf("%10.2f", 123.45678);
```

Output

```
    123.46
```

---

## Scientific Notation

```java
System.out.printf("%e", 12345.6789);
```

Output

```
1.234568e+04
```

---

## Percentage Symbol

```java
System.out.printf("%.1f%%", 95.8);
```

Output

```
95.8%
```

---

# Practice Examples

The following examples are covered in the source code:

- Printing without a new line
- Printing with a new line
- Using `printf()`
- print your name, age and city using printf()
- print the value of pi with exactly 3 decimal places
- print the number 45 with a width of 6
- print the number 45 left-aligned in a width of 6
- print the number 45 with leading zeros to make it 5 digits.
- print a table of 3 students with columns: Name, Age, Marks
- print the discount message: Discount:25%
- print the hexadecimal and octal representation of the number 255.
- print a salary value of 56789.9876 rounded to 2 decimal places.
- create a formatted employee report with columns: ID, Name, Department, and Salary.

<img width="446" height="477" alt="image" src="https://github.com/user-attachments/assets/d8b273ae-b9cd-4e2b-a11a-8325ee940312" />
<img width="446" height="190" alt="image" src="https://github.com/user-attachments/assets/c19075ce-5e10-4eed-a488-ff096a3527eb" />


Refer to the source files for complete implementations:

- **PrintExample.java**
  - https://github.com/Monika752/Java-Guide/blob/main/core-java/01-Introduction_to_Java/PrintExample.java

- **OutputFormatting.java**
  - https://github.com/Monika752/Java-Guide/blob/main/core-java/01-Introduction_to_Java/OutputFormatting.java

---

