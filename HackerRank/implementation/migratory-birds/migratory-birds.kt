import java.io.*
import java.math.*
import java.util.*

// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
    val numOccurenceMap = arr.groupingBy { it }.eachCount()
    val sampleMaximum = numOccurenceMap.maxBy { it.value }?.value

    val typesMaxOccurred = ArrayList<Int>()
    for (type in numOccurenceMap) {
        if (type.value == sampleMaximum) {
            typesMaxOccurred.add(type.key)
        }
    }

    return returnMin(typesMaxOccurred)
}

fun returnMin(list: ArrayList<Int> ): Int {
    val num = list.min()
    return num as Int
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
