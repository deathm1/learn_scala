# Expressions, Instructions, and Operators

## Expressions vs Instructions

In Scala, expressions and instructions (also called statements) are fundamental concepts that define how the language behaves. Here's a detailed explanation of both, followed by a tabular comparison:

### Expressions in Scala

An **expression** is any valid Scala code that can be evaluated to produce a value. In other words, an expression has a **result** that can be used further in the program. Expressions can be simple (like literals) or complex (involving operators, function calls, or combinations of different constructs).

Examples of expressions:

1. **Literal Expression:**

   ```scala
   val x = 5
   ```

   Here, `5` is an expression that evaluates to the value `5`.

2. **Arithmetic Expression:**

   ```scala
   val sum = 3 + 4
   ```

   `3 + 4` is an expression that evaluates to `7`.

3. **Function Call Expression:**

   ```scala
   val result = someFunction(10)
   ```

   This is an expression where the result of `someFunction(10)` is assigned to `result`.

4. **Conditional Expression (Ternary-style):**

   ```scala
   val max = if (a > b) a else b
   ```

   The `if` expression here returns either `a` or `b`, depending on the condition.

5. **Block Expression:**
   ```scala
   val value = {
     val a = 3
     val b = 4
     a + b  // The result of this expression is returned.
   }
   ```
   A block of code can be an expression. The value of the last expression in the block is the result of the block.

### Instructions (Statements)

An **instruction** (or statement) is a unit of code that performs an action but does not return a value. Instructions are executed for their side effects, such as updating a variable, printing output, or calling a method that produces a side effect.

Examples of instructions:

1. **Variable Assignment:**

   ```scala
   var x = 10
   x = x + 5
   ```

   Here, the assignment `x = x + 5` is an instruction because it does not produce a value.

2. **Method Invocation (void return):**

   ```scala
   println("Hello, Scala!")
   ```

   The call to `println` is an instruction because it prints a message but does not return any value.

3. **While Loop:**

   ```scala
   var i = 0
   while (i < 5) {
     println(i)
     i += 1
   }
   ```

   The `while` loop is an instruction that performs the action of printing values but doesn't return a value itself.

4. **Control Structures:**
   ```scala
   if (x > 10) {
     println("Greater")
   } else {
     println("Smaller or equal")
   }
   ```
   Although this might look like an expression, in the context of control structures like `if` (without a return value), it is a statement because it doesn't evaluate to a value.

## Differences Between Expressions and Instructions

| **Aspect**                          | **Expression**                                                           | **Instruction (Statement)**                                                                                                 |
| ----------------------------------- | ------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------- |
| **Definition**                      | An expression evaluates to a value.                                      | An instruction performs an action but does not evaluate to a value.                                                         |
| **Example**                         | `val result = 3 + 4`                                                     | `println("Hello")`                                                                                                          |
| **Value Returned**                  | Always returns a value that can be assigned or used.                     | Does not return a value (void in most cases).                                                                               |
| **Evaluation**                      | Can be evaluated to produce a result.                                    | Cannot be evaluated to produce a result.                                                                                    |
| **Purpose**                         | Used to compute or derive values.                                        | Used for side effects like updating a variable, printing, or controlling program flow.                                      |
| **Use in Assignments**              | The result of an expression can be assigned to a variable.               | Instructions can be part of assignments, but the instruction itself doesn't return a value.                                 |
| **Examples**                        | `val x = a + b`, `val name = if (x > 0) "positive" else "negative"`      | `var x = 10`, `println("Goodbye")`, `while (condition) {}`                                                                  |
| **Control Flow**                    | Can be used within `if`, `while`, etc., as part of expressions.          | Can include control flow structures like `if`, `while`, and `for`, but these act as instructions unless they return values. |
| **Mutability**                      | Usually immutable variables are assigned to the result of an expression. | Mutable variables or side effects are common in instructions.                                                               |
| **Combining with Other Statements** | Can be combined in larger expressions (e.g., `val x = a + (b + c)`)      | May be combined in blocks or used sequentially but not nested in the same way as expressions.                               |

### **Key Takeaways:**

- **Expressions** always return a value and can be combined to form more complex expressions. They are used for calculations, assignments, or any situation where a result is expected.
- **Instructions** do not return values and are used to cause changes or side effects in the program, like printing data or updating variables.

These two concepts are crucial in Scala, as the language emphasizes both functional (expression-based) and imperative (instruction-based) styles.

## Code Blocks

A **code block** in Scala is a group of expressions wrapped in `{}`. The value of the block is the value of its last expression.

### Examples

```scala
val blockResult = {
  val a = 10
  val b = 15
  a + b // Value of the block is 25
}

println(blockResult) // Outputs: 25
```

### Complex Code Block Example

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

## Arithmetic Operators

### Examples

```scala
val a = 15
val b = 4

println(a + b)  // Addition: 19
println(a - b)  // Subtraction: 11
println(a * b)  // Multiplication: 60
println(a / b)  // Division: 3
println(a % b)  // Modulus: 3
```

### Exceptions

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

## Bitwise Operators

### Examples

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

### Exceptions

- Using floating-point numbers:
  ```scala
  val a = 3.14
  val b = 2.71
  // println(a & b) // Compilation Error: Bitwise operators are not defined for floating-point numbers
  ```

---

## Comparison Operators

### Examples

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

### Exceptions

- Comparison between incompatible types:
  ```scala
  val str = "hello"
  val num = 42
  // println(str > num) // Compilation Error: Cannot compare String with Int
  ```

## Logical Operators

| **Operator** | **Description** | **Example**     | **Result** |
| ------------ | --------------- | --------------- | ---------- |
| `!`          | Logical NOT     | `!true`         | `false`    |
| `&&`         | Logical AND     | `true && false` | `false`    |
| `\|\|`       | Logical OR      | `true or false` | `true`     |

### Examples

```scala
val isScalaFun = true
val isPythonFun = false

println(!isScalaFun)       // Logical NOT: false
println(isScalaFun && isPythonFun) // Logical AND: false
println(isScalaFun || isPythonFun) // Logical OR: true
```

#### Short-Circuiting

Logical operators use **short-circuiting**:

- For `&&`, if the first operand is `false`, the second operand is not evaluated.
- For `||`, if the first operand is `true`, the second operand is not evaluated.

##### Example

```scala
def expensiveComputation(): Boolean = {
  println("Computing...")
  true
}

println(false && expensiveComputation()) // Short-circuits, does not call `expensiveComputation`
println(true || expensiveComputation())  // Short-circuits, does not call `expensiveComputation`
```

## Operator Precedence

### Precedence Order (from highest to lowest)

| **Operator**                         | **Category**                 | **Associativity** |
| ------------------------------------ | ---------------------------- | ----------------- |
| `()` `[]`                            | Postfix                      | Left to Right     |
| `!` `~`                              | Unary                        | Right to Left     |
| `*` `/` `%`                          | Multiplicative               | Left to Right     |
| `+` `-`                              | Additive                     | Left to Right     |
| `>>` `>>>` `<<`                      | Shift                        | Left to Right     |
| `<` `<=` `>` `>=`                    | Relational                   | Left to Right     |
| `==` `!=`                            | Relational (equality)        | Left to Right     |
| `&`                                  | Bitwise AND                  | Left to Right     |
| `^`                                  | Bitwise XOR                  | Left to Right     |
| `\|\`                                | Bitwise OR                   | Left to Right     |
| `&&`                                 | Logical AND                  | Left to Right     |
| `\|\|`                               | Logical OR                   | Left to Right     |
| `= += -= *= /= %= >>= <<= &= ^= \|=` | Assignment                   | Right to Left     |
| `,`                                  | Comma (separate expressions) | Left to Right     |

### Examples

```scala
val result = 10 + 5 * 2  // Multiplication has higher precedence: 10 + (5 * 2) = 20
println(result)

val result2 = 10 + 5 > 12 && 20 > 15  // Comparison > has higher precedence than + or &&
println(result2)  // true
```

#### Using Parentheses to Override Precedence

```scala
val result = (10 + 5) * 2  // Parentheses change precedence: (15) * 2 = 30
println(result)
```

---

### **Key Takeaways**

- Always use parentheses when in doubt about operator precedence.
- Understand that **Scala's operators are methods**, so chaining or overloading them is possible.
- Logical operators (`&&`, `||`) short-circuit to avoid unnecessary computations.