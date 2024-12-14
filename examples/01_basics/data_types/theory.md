# Scala Data Types Overview

Scala provides a wide range of data types categorized into two main types:

1. **Value Types (Primitive types)**
2. **Reference Types (Objects, Arrays, etc.)**

#### **1. Value Types (Primitive Types)**

Scala has eight basic types that map directly to Java's primitive types.

| **Type**  | **Description**                                                                | **Example**                        | **Allowed Range**                    |
| --------- | ------------------------------------------------------------------------------ | ---------------------------------- | ------------------------------------ |
| `Byte`    | 8-bit signed integer (-128 to 127). Used for memory optimization.              | `val byteValue: Byte = 100`        | -128 to 127                          |
| `Short`   | 16-bit signed integer (-32,768 to 32,767).                                     | `val shortValue: Short = 3000`     | -32,768 to 32,767                    |
| `Int`     | 32-bit signed integer (-2,147,483,648 to 2,147,483,647). Default for integers. | `val intValue: Int = 123456`       | -2,147,483,648 to 2,147,483,647      |
| `Long`    | 64-bit signed integer. Large range numbers.                                    | `val longValue: Long = 123L`       | -2^63 to (2^63 - 1)                  |
| `Float`   | 32-bit single-precision floating-point number. Append `f` to the number.       | `val floatValue: Float = 12.34f`   | ±1.4E-45 to ±3.4028235E38            |
| `Double`  | 64-bit double-precision floating-point number. Default for decimals.           | `val doubleValue: Double = 123.45` | ±4.9E-324 to ±1.7976931348623157E308 |
| `Char`    | 16-bit unsigned Unicode character. Use single quotes.                          | `val charValue: Char = 'A'`        | '\u0000' to '\uffff' (0 to 65,535)   |
| `Boolean` | Represents `true` or `false`.                                                  | `val boolValue: Boolean = true`    | `true` or `false`                    |


#### **2. Reference Types**

Reference types store references to objects. Scala provides rich reference types.

| **Type**       | **Description**                                                                                     | **Example**                                 | **Allowed Range/Constraints**           |
|----------------|-----------------------------------------------------------------------------------------------------|-------------------------------------------|-----------------------------------------|
| `String`       | Immutable sequence of characters. Used for text manipulation.                                       | `val str: String = "Hello, Scala!"`        | No fixed range. Depends on memory.      |
| `Array`        | A fixed-size collection of elements of the same type.                                               | `val arr: Array[Int] = Array(1, 2, 3)`     | Fixed size. Index from `0` to `length-1`. |
| `List`         | Immutable linked list. Elements cannot be changed after creation.                                   | `val list: List[Int] = List(1, 2, 3)`      | No fixed range. Depends on memory.      |
| `Set`          | Immutable or mutable collection of unique elements.                                                 | `val set: Set[Int] = Set(1, 2, 3)`         | Unique elements. No duplicate values.   |
| `Map`          | Collection of key-value pairs. Immutable by default but mutable versions available.                 | `val map: Map[String, Int] = Map("a" -> 1)`| Keys must be unique.                   |
| `Option`       | Represents optional values. Used to avoid `null`. Can be `Some(value)` or `None`.                   | `val maybeValue: Option[Int] = Some(10)`   | Only `Some(value)` or `None`.           |
| `Tuple`        | Immutable grouping of values with varying types.                                                    | `val tuple: (Int, String) = (1, "Scala")`  | Fixed size and types defined by the tuple. |
| `Either`       | Represents one of two possible values: `Left` (usually error) or `Right` (usually success).          | `val result: Either[String, Int] = Right(10)` | `Left(value)` or `Right(value)` only.  |
| `Any`          | The root type for all Scala types.                                                                  | `val anyValue: Any = 42`                   | Can hold any value.                     |
| `AnyRef`       | The root type for all reference types. Equivalent to `Object` in Java.                              | `val ref: AnyRef = "Reference"`            | Can hold any reference type.            |
| `Null`         | A subtype of all reference types. Represents a null reference.                                      | `val nullValue: String = null`             | Only the `null` value is allowed.       |
| `Nothing`      | A subtype of all types. Used to indicate abnormal termination or absence of a value.                | `def fail(): Nothing = throw new Exception("Error")` | No values. Represents absence.          |


### **Examples**

#### Primitive Types

```scala
// Byte
val byteValue: Byte = 100

// Short
val shortValue: Short = 3000

// Int
val intValue: Int = 123456

// Long
val longValue: Long = 1234567890123456789L

// Float
val floatValue: Float = 12.34f

// Double
val doubleValue: Double = 123.456

// Char
val charValue: Char = 'A'

// Boolean
val boolValue: Boolean = true
```

#### Reference Types

```scala
// String
val stringValue: String = "Hello, Scala!"

// Unit
def log(): Unit = println("Logging something...")

// Null
val nullValue: String = null

// Nothing
def fail(message: String): Nothing = throw new RuntimeException(message)

// Any
val anyValue: Any = 123

// AnyVal
val anyValValue: AnyVal = 3.14

// AnyRef
val anyRefValue: AnyRef = "Hello"

// Array
val arr: Array[Int] = Array(1, 2, 3)

// List
val list: List[Int] = List(1, 2, 3)

// Option
val opt: Option[Int] = Some(10)

// Map
val map: Map[String, Int] = Map("a" -> 1, "b" -> 2)

// Tuple
val tuple: (Int, String, Boolean) = (1, "Scala", true)

// Function
val add: (Int, Int) => Int = (a, b) => a + b
```

| **Type**    | **Category** | **Description**                                                                                       | **Example**                                     |
| ----------- | ------------ | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------- |
| `Byte`      | Primitive    | 8-bit signed integer (-128 to 127). Used for memory optimization.                                     | `val byteValue: Byte = 100`                     |
| `Short`     | Primitive    | 16-bit signed integer (-32,768 to 32,767).                                                            | `val shortValue: Short = 3000`                  |
| `Int`       | Primitive    | 32-bit signed integer (-2,147,483,648 to 2,147,483,647). Default for integers.                        | `val intValue: Int = 123456`                    |
| `Long`      | Primitive    | 64-bit signed integer. Large range numbers.                                                           | `val longValue: Long = 1234567890123456789L`    |
| `Float`     | Primitive    | 32-bit single-precision floating-point number. Append `f` to the number.                              | `val floatValue: Float = 12.34f`                |
| `Double`    | Primitive    | 64-bit double-precision floating-point number. Default for decimals.                                  | `val doubleValue: Double = 123.456`             |
| `Char`      | Primitive    | 16-bit unsigned Unicode character. Use single quotes.                                                 | `val charValue: Char = 'A'`                     |
| `Boolean`   | Primitive    | Represents `true` or `false`.                                                                         | `val boolValue: Boolean = true`                 |
| `String`    | Reference    | Sequence of characters enclosed in double quotes.                                                     | `val stringValue: String = "Hello, Scala!"`     |
| `Unit`      | Reference    | Represents no value or void. It’s the return type of functions that don’t return anything meaningful. | `def log(): Unit = println("Logging...")`       |
| `Null`      | Reference    | A subtype of all reference types. Represents `null` value.                                            | `val nullValue: String = null`                  |
| `Nothing`   | Reference    | Subtype of all types. Typically used for functions that never return (like throwing exceptions).      | `def fail(message: String): Nothing = throw...` |
| `Any`       | Reference    | Supertype of all types.                                                                               | `val anyValue: Any = 123`                       |
| `AnyVal`    | Reference    | Superclass of all value types.                                                                        | `val anyValValue: AnyVal = 3.14`                |
| `AnyRef`    | Reference    | Superclass of all reference types. Alias for Java's `Object` class.                                   | `val anyRefValue: AnyRef = "Hello"`             |
| `Array[T]`  | Reference    | Represents fixed-length sequences of elements of type `T`.                                            | `val arr: Array[Int] = Array(1, 2, 3)`          |
| `List[T]`   | Reference    | Immutable linked list of elements of type `T`.                                                        | `val list: List[Int] = List(1, 2, 3)`           |
| `Option[T]` | Reference    | Represents optional values. Either `Some(value)` or `None`.                                           | `val opt: Option[Int] = Some(10)`               |
| `Map[K, V]` | Reference    | Collection of key-value pairs.                                                                        | `val map: Map[String, Int] = Map("a" -> 1)`     |
| `Tuple`     | Reference    | Fixed-length collection of heterogeneous elements.                                                    | `val tuple: (Int, String, Boolean) = (1, ...)`  |
| `Function`  | Reference    | First-class function representation.                                                                  | `val add: (Int, Int) => Int = (a, b) => a + b`  |



# Difference between Primitve and Reference Types


In Scala, types can be categorized into **Primitive Types** (also called value types) and **Reference Types**. Here’s a detailed comparison:



| **Aspect**             | **Primitive Types**                                                                                                                                               | **Reference Types**                                                                                                                                                      |
|------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Definition**          | Primitive types represent basic data values and are immutable.                                                                                                   | Reference types are abstractions that point to objects stored in memory.                                                                                                |
| **Examples**            | `Byte`, `Short`, `Int`, `Long`, `Float`, `Double`, `Char`, `Boolean`.                                                                                            | `String`, `Array`, `List`, `Map`, `Option`, `Tuple`, custom objects, etc.                                                                                               |
| **Storage**             | Stored in **stack memory** for efficiency.                                                                                                                       | Stored in **heap memory**, with their references (addresses) stored in the stack.                                                                                       |
| **Mutability**          | Immutable by nature (cannot change their value).                                                                                                                 | Can be mutable (`Array`, `HashMap`) or immutable (`String`, `List`).                                                                                                    |
| **Performance**         | Faster due to direct memory access and fewer overheads.                                                                                                         | Slower because of indirection (accessing via references) and garbage collection overhead.                                                                               |
| **Memory Footprint**    | Small, fixed memory footprint because their size is determined by their bit-width (e.g., 32-bit for `Int`).                                                       | Larger and variable memory footprint, as they hold metadata and the actual data in memory.                                                                              |
| **Inheritance**         | Directly inherit from `AnyVal`, a subtype of `Any`.                                                                                                              | Inherit from `AnyRef`, a subtype of `Any`, similar to Java’s `Object`.                                                                                                  |
| **Default Value**       | Have predefined default values (e.g., `0` for `Int`, `false` for `Boolean`).                                                                                     | Default value is `null`, indicating an uninitialized reference.                                                                                                         |
| **Nullability**         | Cannot be `null`.                                                                                                                                                | Can be assigned `null`, but it's discouraged in favor of using `Option` or `Either`.                                                                                   |
| **Wrapper Class**       | Automatically wrapped into a reference type when necessary (e.g., `Int` becomes `java.lang.Integer` in Java interoperability).                                   | No unwrapping needed as they are already reference types.                                                                                                              |
| **Boxing/Unboxing**     | Subject to **autoboxing** (converted to objects) and **unboxing** (converted back to primitives) in certain situations like collections.                          | Not subject to boxing/unboxing since they are objects by design.                                                                                                       |
| **Usage Context**       | Typically used for computations, indexing, and cases where efficiency is paramount.                                                                              | Used to model complex entities, relationships, or collections.                                                                                                         |
| **Examples in Action**  | ```scala<br>val x: Int = 42<br>val isTrue: Boolean = true<br>```                                                                                                  | ```scala<br>val name: String = "Scala"<br>val numbers: List[Int] = List(1, 2, 3)<br>```                                                                                 |

---

### **Key Characteristics of Primitive Types**
1. **Fixed Size and Range**: Each primitive type has a fixed size and range:
   - For instance, `Int` is a 32-bit integer with a range from `-2,147,483,648` to `2,147,483,647`.
2. **Optimized for Performance**: Operate directly at the CPU level, leading to better performance in computations.
3. **Immutable**: Their values cannot change after being assigned.
4. **Scala-Specific Behavior**:
   - Scala treats primitives as **objects** when needed, e.g., using `.toString` on an `Int`.

#### Example:
```scala
val x: Int = 42
println(x.toString)  // Converts primitive to a string
```

---

### **Key Characteristics of Reference Types**
1. **Point to Objects in Memory**: Store a memory address of the actual data.
2. **Supports Complex Structures**: Used for complex entities like collections (`List`, `Map`), strings, or user-defined objects.
3. **May Be Mutable**:
   - Some reference types allow modifications (e.g., `Array`), while others are immutable (e.g., `String`).
4. **Null Handling**:
   - Reference types can hold `null`, which represents the absence of a value. To avoid `NullPointerException`, Scala encourages using `Option` or `Either`.

#### Example:
```scala
val name: String = "Scala"
val list: List[Int] = List(1, 2, 3)
```

---

### **Relationship with `Any`, `AnyVal`, and `AnyRef`**

1. **`Any`:**
   - The root type of all types in Scala.
   - Both primitive and reference types inherit from `Any`.

2. **`AnyVal`:**
   - The parent class for all primitive types like `Int`, `Boolean`, etc.
   - These are value types that are optimized for performance.

3. **`AnyRef`:**
   - The parent class for all reference types.
   - Similar to `Object` in Java.

#### Hierarchy Diagram:
```
                   Any
                  /   \
           AnyVal     AnyRef
         (Primitives) (References)
```

---

### **Practical Example Comparing Primitive and Reference Types**
```scala
// Primitive Type
val num: Int = 42    // Primitive type
val increment = num + 1
println(s"Number: $num, Incremented: $increment")  // Number: 42, Incremented: 43

// Reference Type
val str: String = "Scala"  // Reference type
val newStr = str + " Rocks!"
println(s"Original: $str, New: $newStr")  // Original: Scala, New: Scala Rocks!

// Nullability Check (Reference Type)
val nullStr: String = null
println(nullStr == null)  // true
```

---

### **When to Use Primitive vs. Reference Types**
- **Primitive Types**: Prefer when performance and simplicity matter (e.g., loops, arithmetic operations).
- **Reference Types**: Use for complex data, text manipulation, collections, and objects.