package lesson7

fun main() {

    ageDescription()

    minDivisor()

    brickPasses()

}

//                                   Task1

fun ageDescription(age: Int): String {
    when (age) {
        in 0..200,
        -> {
            if (age % 10 == 1 && age % 100 != 11) {
                println("$age god");
            } else if (age % 10 in 2..4 && (age % 100 < 12 || age % 100 > 14)) {
                println("$age goda");
            } else {
                println("$age let");
            }
        }

        else -> {
            println("Invalid value!")
        }
    }
    return age.toString()
}

//                                 Task2

fun minDivisor(n: Int): Int {
    when (n) {
        in 2..Int.MAX_VALUE,
        -> {
            var MinDivisor = 2

            while (n % MinDivisor != 0) {
                MinDivisor++
            }
            println("Least divisor is $MinDivisor")
            return MinDivisor
        }

        else -> {
            println("Invalid Value")
        }
    }
    return n
}

//                                       Task3

fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean {

    if ((a <= r && b <= s) || (b <= r && a <= s) ||
            (a <= r && c <= s) || (c <= r && a <= s) ||
            (c <= r && b <= s) || (b <= r && c <= s)) {
        println("brick will pass")
    } else {
        println("brick won't pass")
    }
    return true
}