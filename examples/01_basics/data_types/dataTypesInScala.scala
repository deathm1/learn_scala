object dataTypesInScala{
    def main(args: Array[String]): Unit = {
        println("Data Types example")

        // Primitive Data Types

        // Byte: 8-bit signed integer (-128 to 127). Used for memory optimization.
        val byteValue: Byte = 100
        println(byteValue)

        // Short: 16-bit signed integer (-32,768 to 32,767).
        val shortValue: Short = 3000
        println(shortValue)

        // Int: 32-bit signed integer (-2,147,483,648 to 2,147,483,647). Default for integers.
        val intValue: Int = 123456
        println(intValue)

        // Long: 64-bit signed integer. -2^63 to (2^63 - 1)
        val longValue: Long = 1234567890123456789L
        println(longValue)

        // Float: 32-bit single-precision floating-point number. Append f to the number. ±1.4E-45 to ±3.4028235E38
        val floatValue: Float = 12.34f
        println(floatValue)

        // Double: 64-bit double-precision floating-point number. Default for decimals. ±4.9E-324 to ±1.7976931348623157E308
        val doubleValue: Double = 123.456
        println(doubleValue)

        // Char: 16-bit unsigned Unicode character. Use single quotes. '\u0000' to '\uffff' (0 to 65,535)
        val charValue: Char = 'A'
        println(charValue)

        // Boolean: Represents true or false. true or false
        val boolValue: Boolean = true
        println(boolValue)


        // Reference Types

        // String
        val stringValue: String = "Hello, Scala!"
        println(stringValue)

        // Unit
        def log(): Unit = println("Logging something...")

        // Null
        val nullValue: String = null
        println(nullValue)

        // Nothing
        def fail(message: String): Nothing = throw new RuntimeException(message)

        // Any
        val anyValue: Any = 123

        println(anyValue)

        // AnyVal
        val anyValValue: AnyVal = 3.14
        println(anyValValue)

        // AnyRef
        val anyRefValue: AnyRef = "Hello"
        println(anyRefValue)
        

        // Array
        val arr: Array[Int] = Array(1, 2, 3)
        println(arr)

        // List
        val list: List[Int] = List(1, 2, 3)
        println(list)

        // Option
        val opt: Option[Int] = Some(10)
        println(opt)

        // Map
        val map: Map[String, Int] = Map("a" -> 1, "b" -> 2)
        println(map)

        // Tuple
        val tuple: (Int, String, Boolean) = (1, "Scala", true)
        println(tuple)

        // Function
        val add: (Int, Int) => Int = (a, b) => a + b
        println(add)
    }
}