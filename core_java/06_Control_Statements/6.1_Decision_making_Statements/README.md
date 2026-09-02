# Control Statements in Java

Control statements are used to control the flow of execution of a Java program based on conditions or choices.

They help the program decide:

- Whether a block of code should execute
- Which block of code should execute
- How many times a block should execute

---

# Types of Control Statements

Control statements can be mainly divided into:

1. Conditional Statements
2. Selection Statements
3. Looping Statements

In this section, we are learning:

- `if`
- `if-else`
- Nested `if-else`
- `else-if` ladder
- `switch`

---

# if Statement

The `if` statement is used to execute a block of code only when a given condition is `true`.

## Syntax

```java
if (condition) {
    // statements
}
```

If the condition is `true`, the statements inside the `if` block are executed.

If the condition is `false`, the `if` block is skipped.

---

# Example

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

Output

```text
Eligible to vote
```

Since `age >= 18` is `true`, the statement inside the `if` block is executed.

---

# if-else Statement

The `if-else` statement is used when we want to execute one block when the condition is `true` and another block when the condition is `false`.

## Syntax

```java
if (condition) {
    // statements if condition is true
} else {
    // statements if condition is false
}
```

---

# Example

```java
int number = 10;

if (number % 2 == 0) {
    System.out.println("Even Number");
} else {
    System.out.println("Odd Number");
}
```

Output

```text
Even Number
```

Since `10 % 2 == 0` is `true`, the `if` block is executed.

---

# Nested if-else

A nested `if-else` means placing one `if-else` statement inside another `if` or `else` block.

It is useful when one condition needs to be checked only after another condition is satisfied.

## Syntax

```java
if (condition1) {

    if (condition2) {
        // statements
    } else {
        // statements
    }

} else {
    // statements
}
```

---

# Example

```java
int age = 20;
boolean hasLicense = true;

if (age >= 18) {

    if (hasLicense) {
        System.out.println("You can drive");
    } else {
        System.out.println("You need a driving license");
    }

} else {
    System.out.println("You are not eligible to drive");
}
```

Output

```text
You can drive
```

### How it works

First condition:

```java
age >= 18
```

Since it is `true`, Java enters the outer `if` block.

Then it checks:

```java
hasLicense
```

Since it is also `true`, the statement:

```text
You can drive
```

is printed.

---

# else-if Ladder

The `else-if` ladder is used when there are multiple conditions to check.

Java checks the conditions from top to bottom.

As soon as one condition becomes `true`, its block is executed and the remaining conditions are skipped.

## Syntax

```java
if (condition1) {
    // statements
} else if (condition2) {
    // statements
} else if (condition3) {
    // statements
} else {
    // statements
}
```

---

# Example

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A+");
} else if (marks >= 80) {
    System.out.println("Grade A");
} else if (marks >= 70) {
    System.out.println("Grade B");
} else if (marks >= 60) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

Output

```text
Grade A
```

Since `marks >= 80` is the first condition that becomes `true`, Java executes that block and skips the remaining conditions.

---

# Important Point in else-if Ladder

The order of conditions is important.

For example:

```java
int marks = 85;

if (marks >= 60) {
    System.out.println("Grade C");
} else if (marks >= 80) {
    System.out.println("Grade A");
}
```

Output

```text
Grade C
```

Even though `85 >= 80` is `true`, the first condition `marks >= 60` is already `true`.

Therefore, the second condition is never checked.

So, always arrange conditions in the correct order.

---

# switch Statement

The `switch` statement is used to execute one block of code from multiple possible choices.

It is useful when we are comparing one variable with multiple fixed values.

## Syntax

```java
switch (expression) {

    case value1:
        // statements
        break;

    case value2:
        // statements
        break;

    default:
        // statements
}
```

---

# Example

```java
int day = 2;

switch (day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

Output

```text
Tuesday
```

Since the value of `day` is `2`, the `case 2` block is executed.

---

# break in switch

The `break` statement is used to exit the `switch` statement after executing the matching case.

Example:

```java
int number = 2;

switch (number) {

    case 1:
        System.out.println("One");
        break;

    case 2:
        System.out.println("Two");
        break;

    case 3:
        System.out.println("Three");
        break;
}
```

Output

```text
Two
```

Without `break`, Java may continue executing the statements in the following cases. This is called **fall-through**.

---

# default in switch

The `default` block is executed when none of the cases match.

Example:

```java
int day = 10;

switch (day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

Output

```text
Invalid Day
```

---

# switch with char

The `switch` statement can also be used with `char`.

```java
char grade = 'A';

switch (grade) {

    case 'A':
        System.out.println("Excellent");
        break;

    case 'B':
        System.out.println("Good");
        break;

    case 'C':
        System.out.println("Average");
        break;

    default:
        System.out.println("Invalid Grade");
}
```

Output

```text
Excellent
```

---

# switch with String

The `switch` statement can also be used with `String`.

```java
String day = "Monday";

switch (day) {

    case "Monday":
        System.out.println("Start of the week");
        break;

    case "Friday":
        System.out.println("Almost weekend");
        break;

    case "Sunday":
        System.out.println("Weekend");
        break;

    default:
        System.out.println("Normal working day");
}
```

Output

```text
Start of the week
```

---


# Control Statement Flow

```text
                 Control Statements
                        |
        --------------------------------
        |              |               |
   if / if-else     else-if          switch
        |             ladder             |
   Condition       Multiple          Multiple
     check         conditions         choices
```

---

# Best Practices

✔ Use `if` when only one condition needs to be checked.

✔ Use `if-else` when there are two possible outcomes.

✔ Use nested `if` when one condition depends on another condition.

✔ Use `else-if` ladder when multiple conditions need to be checked.

✔ Use `switch` when comparing one value against multiple fixed values.

✔ Always use `break` in `switch` when fall-through is not required.

✔ Always use `default` in `switch` to handle unexpected values.

✔ Arrange `else-if` conditions carefully.

✔ Use proper indentation to make nested conditions easy to understand.

---

# Common Mistakes

### Mistake 1: Using `=` instead of `==`

Incorrect:

```java
if (number = 10) {
    System.out.println("Ten");
}
```

Correct:

```java
if (number == 10) {
    System.out.println("Ten");
}
```

`=` is the assignment operator.

`==` is the comparison operator.

---

### Mistake 2: Forgetting `break`

```java
switch (choice) {

    case 1:
        System.out.println("One");

    case 2:
        System.out.println("Two");
}
```

Without `break`, execution can continue into the next case.

Correct:

```java
switch (choice) {

    case 1:
        System.out.println("One");
        break;

    case 2:
        System.out.println("Two");
        break;
}
```

---

### Mistake 3: Wrong order in else-if

Incorrect:

```java
if (marks >= 60) {
    System.out.println("C");
} else if (marks >= 90) {
    System.out.println("A+");
}
```

Correct:

```java
if (marks >= 90) {
    System.out.println("A+");
} else if (marks >= 60) {
    System.out.println("C");
}
```

---

