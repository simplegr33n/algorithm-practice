import java.io.*
import java.util.*


// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var totalBreaksHigh = 0
    var totalBreaksLow = 0
    var currentRecord = 0

    // find total high-score breaks
    currentRecord = scores[0]
    for (score in scores) {
        if (score > currentRecord) {
            currentRecord = score
            totalBreaksHigh++
        }
    }

    // find total low-score breaks
    currentRecord = scores[0]
    for (score in scores) {
        if (score < currentRecord) {
            currentRecord = score
            totalBreaksLow++
        }
    }

    return arrayOf(totalBreaksHigh, totalBreaksLow)

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
