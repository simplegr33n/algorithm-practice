import java.io.*
import java.util.*



// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var possibleSections = 0
    var currentIndex = 0

    for (item in s) {
        if (currentIndex + (m-1) < s.size) {
            var checkSum = 0

            for (i in currentIndex..(currentIndex + m - 1)) {
                checkSum += s[i]
            }

            if (checkSum == d) {
                possibleSections++
            }

            currentIndex++
        }
    }

    return possibleSections
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
