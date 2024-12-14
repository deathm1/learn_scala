object expressionsInstructions{
    def main(args: Array[String]): Unit = {
        println("Expressions and Instructions")
        val result = 10 + 5 * 2  // Multiplication has higher precedence: 10 + (5 * 2) = 20
        println(result)
    }
}