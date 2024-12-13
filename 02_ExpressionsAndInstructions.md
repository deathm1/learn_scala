# Expressions, Instructions, and Operators in Scala (With Multiple Examples)

---

## **1. Expressions vs. Instructions**

### **Expressions:**
An **expression** in Scala always evaluates to a value.

#### **Examples:**
```scala
val sum = 10 + 5    // Evaluates to 15
val greeting = "Hello" + ", World!"  // Evaluates to "Hello, World!"

val expressionValue = {
  val x = 10
  val y = 20
  x * y  // Value of the block is 200
}

println(expressionValue) // Outputs: 200
```

---

### **Instructions:**
An **instruction** performs an action but doesn’t produce a meaningful value.

#### **Examples:**
```scala
println("This is an instruction") // Prints the text but returns Unit

var counter = 0
counter = counter + 1  // Instruction to increment the counter
```

#### **Exceptions:**
Instructions don’t return meaningful values (only `Unit`), so they cannot be directly assigned to variables:
```scala
val result = println("Invalid assignment") // Compilation Error
```

---

## **2. Code Blocks**

A **code block** in Scala is a group of expressions wrapped in `{}`. The value of the block is the value of its last expression.

### **Examples:**
```scala
val blockResult = {
  val a = 10
  val b = 15
  a + b // Value of the block is 25
}

println(blockResult) // Outputs: 25
```

#### **Complex Code Block Example:**
```scala
val result = {
  val base = 10
  if (base > 5) {
    base * 2  // This gets executed, block value: 20
  } else {
    base / 2
  }
}

println(result) // Outputs: 20
```

---

## **3. Arithmetic Operators**

### **Examples:**
```scala
val a = 15
val b = 4

println(a + b)  // Addition: 19
println(a - b)  // Subtraction: 11
println(a * b)  // Multiplication: 60
println(a / b)  // Division: 3
println(a % b)  // Modulus: 3
```

#### **Exceptions:**
1. Division by zero:
   ```scala
   val x = 10
   val y = 0
   // println(x / y) // Throws ArithmeticException: / by zero
   ```
2. Incompatible types:
   ```scala
   val num = 10
   val str = "5"
   // println(num + str) // Compilation Error: type mismatch
   ```

---

## **4. Bitwise Operators**

### **Examples:**
```scala
val x = 5  // Binary: 0101
val y = 3  // Binary: 0011

println(x & y)  // AND: 1 (Binary: 0001)
println(x | y)  // OR: 7 (Binary: 0111)
println(x ^ y)  // XOR: 6 (Binary: 0110)
println(x << 2) // Left Shift: 20 (Binary: 10100)
println(x >> 1) // Signed Right Shift: 2 (Binary: 0010)
println(-8 >>> 2) // Unsigned Right Shift: Large Value
```

#### **Exceptions:**
- Using floating-point numbers:
  ```scala
  val a = 3.14
  val b = 2.71
  // println(a & b) // Compilation Error: Bitwise operators are not defined for floating-point numbers
  ```

---

## **5. Comparison Operators**

### **Examples:**
```scala
val num1 = 10
val num2 = 20

println(num1 == num2) // Equal to: false
println(num1 != num2) // Not equal to: true
println(num1 > num2)  // Greater than: false
println(num1 >= num2) // Greater than or equal to: false
println(num1 < num2)  // Less than: true
println(num1 <= num2) // Less than or equal to: true
```

#### **Exceptions:**
- Comparison between incompatible types:
  ```scala
  val str = "hello"
  val num = 42
  // println(str > num) // Compilation Error: Cannot compare String with Int
  ```

---

## **6. Logical Operators**

| **Operator** | **Description**        | **Example**             | **Result** |
|--------------|------------------------|-------------------------|------------|
| `!`          | Logical NOT            | `!true`                 | `false`    |
| `&&`         | Logical AND            | `true && false`         | `false`    |
| `||`         | Logical OR             | `true || false`         | `true`     |

### **Examples:**
```scala
val isScalaFun = true
val isPythonFun = false

println(!isScalaFun)       // Logical NOT: false
println(isScalaFun && isPythonFun) // Logical AND: false
println(isScalaFun || isPythonFun) // Logical OR: true
```

#### **Short-Circuiting:**
Logical operators use **short-circuiting**:
- For `&&`, if the first operand is `false`, the second operand is not evaluated.
- For `||`, if the first operand is `true`, the second operand is not evaluated.

#### **Example:**
```scala
def expensiveComputation(): Boolean = {
  println("Computing...")
  true
}

println(false && expensiveComputation()) // Short-circuits, does not call `expensiveComputation`
println(true || expensiveComputation())  // Short-circuits, does not call `expensiveComputation`
```

---

## **7. Operator Precedence**

### **Precedence Order (from highest to lowest):**
1. `!` (Logical NOT)
2. `*`, `/`, `%` (Multiplication, Division, Modulus)
3. `+`, `-` (Addition, Subtraction)
4. `<<`, `>>`, `>>>` (Bitwise shifts)
5. `&` (Bitwise AND)
6. `^` (Bitwise XOR)
7. `|` (Bitwise OR)
8. `&&` (Logical AND)
9. `||` (Logical OR)
10. Comparison operators (`==`, `!=`, `<`, `<=`, `>`, `>=`)

### **Examples:**
```scala
val result = 10 + 5 * 2  // Multiplication has higher precedence: 10 + (5 * 2) = 20
println(result)

val result2 = 10 + 5 > 12 && 20 > 15  // Comparison > has higher precedence than + or &&
println(result2)  // true
```

#### **Using Parentheses to Override Precedence:**
```scala
val result = (10 + 5) * 2  // Parentheses change precedence: (15) * 2 = 30
println(result)
```

---

### **Key Takeaways**
- Always use parentheses when in doubt about operator precedence.
- Understand that **Scala's operators are methods**, so chaining or overloading them is possible.
- Logical operators (`&&`, `||`) short-circuit to avoid unnecessary computations.

Let me know if you'd like examples of overloading operators or more details! 😊