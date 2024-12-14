object expressionsInstructions{
    def main(args: Array[String]): Unit = {
        println("Expressions and Instructions")

        // Expression
        val result1 = 10 + 5 * 2  // Multiplication has higher precedence: 10 + (5 * 2) = 20
        println(result1)


        val result = {
            val base = 10
            if (base > 5) {
                base * 2  // This gets executed, block value: 20
            } else {
                base / 2
            }
        }

        println(result)


        val blockResult = {
            val a = 10
            val b = 15
            a + b // Value of the block is 25
        }

        println(blockResult) // Outputs: 25
    }
}