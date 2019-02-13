import java.io.*
import java.util.*


// Complete the birthdayCakeCandles function below.
fun birthdayCakeCandles(ar: Array<Int>): Int {
    val max = ar.max()
    var totalMaxHeightCandles = 0
    for (item in ar) {
        if (item == max) {
            totalMaxHeightCandles++
        }
    }
    return totalMaxHeightCandles
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}