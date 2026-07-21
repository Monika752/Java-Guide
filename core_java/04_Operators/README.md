# Java Operators

Operators are special symbols in Java that perform operations on one or more operands (variables or values). They are used for arithmetic calculations, comparisons, logical operations, assignments, and more.

## Types of Operators

Java provides the following types of operators:

1. Arithmetic Operators
2. Assignment Operators
3. Unary Operators
4. Relational Operators
5. Logical Operators
6. Bitwise Operators
7. Shift Operators
8. Ternary Operator
9. `instanceof` Operator

---

## 1. Arithmetic Operators

Used to perform mathematical calculations.

| Operator | Description |
|----------|-------------|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus (Remainder) |

**Example**

```java
int a = 20;
int b = 6;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

> **Note:** Integer division removes the decimal part. Use a floating-point value (`double` or `float`) if you need decimal results.

---

## 2. Assignment Operators

Used to assign or update values of variables.

| Operator | Equivalent To |
|----------|---------------|
| `=` | Assignment |
| `+=` | `a = a + b` |
| `-=` | `a = a - b` |
| `*=` | `a = a * b` |
| `/=` | `a = a / b` |
| `%=` | `a = a % b` |

---

## 3. Unary Operators

Operate on a single operand.

| Operator | Description |
|----------|-------------|
| `+` | Unary Plus |
| `-` | Unary Minus |
| `++` | Increment |
| `--` | Decrement |
| `!` | Logical NOT |

### Prefix vs Postfix

- **Prefix (`++a`)** → Increment first, then use the value.
- **Postfix (`a++`)** → Use the current value first, then increment.

---

## 4. Relational Operators

Used to compare two values. The result is always a boolean (`true` or `false`).

| Operator | Description |
|----------|-------------|
| `==` | Equal to |
| `!=` | Not equal to |
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal to |
| `<=` | Less than or equal to |

---

## 5. Logical Operators

Used to combine multiple boolean expressions.

| Operator | Description |
|----------|-------------|
| `&&` | Logical AND |
| `||` | Logical OR |
| `!` | Logical NOT |

### Short-Circuit Evaluation

- `&&` stops evaluating when the first condition is `false`.
- `||` stops evaluating when the first condition is `true`.

This improves performance and prevents unnecessary evaluations.

---

## 6. Bitwise Operators

Perform operations on the binary representation of integers.

| Operator | Description |
|----------|-------------|
| `&` | Bitwise AND |
| `|` | Bitwise OR |
| `^` | Bitwise XOR |
| `~` | Bitwise Complement |

---

## 7. Shift Operators

Shift the bits of a number to the left or right.

| Operator | Description |
|----------|-------------|
| `<<` | Left Shift |
| `>>` | Signed Right Shift |
| `>>>` | Unsigned Right Shift |

---

## 8. Ternary Operator

A shorthand for the `if-else` statement.

**Syntax**

```java
condition ? valueIfTrue : valueIfFalse;
```

**Example**

```java
String result = age >= 18 ? "Eligible" : "Not Eligible";
```

---

## 9. `instanceof` Operator

Checks whether an object belongs to a particular class or interface.

```java
String name = "Java";

System.out.println(name instanceof String);
```

> This operator is mainly used in Object-Oriented Programming (OOP).

---

## Operator Precedence

When multiple operators appear in an expression, Java follows a predefined precedence order.

| Priority | Operators |
|----------|-----------|
| Highest | `()`, `.`, `[]` |
| Unary | `++`, `--`, `!` |
| Multiplicative | `*`, `/`, `%` |
| Additive | `+`, `-` |
| Shift | `<<`, `>>`, `>>>` |
| Relational | `<`, `<=`, `>`, `>=` |
| Equality | `==`, `!=` |
| Bitwise | `&`, `^`, `|` |
| Logical | `&&`, `||` |
| Ternary | `?:` |
| Assignment | `=`, `+=`, `-=`, `*=`, `/=`, `%=` |

---

## Best Practice

- Use parentheses `()` to improve readability in complex expressions.
- Avoid writing multiple increment (`++`) or decrement (`--`) operators in the same expression.
- Prefer meaningful variable names when performing calculations.
- Understand operator precedence to avoid unexpected results.

---

## Example Programs

You can find example programs here:

- **OperatorsExample.java**  
  https://github.com/Monika752/Java-Guide/blob/main/core-java/04-Operators/OperatorExample.java

---