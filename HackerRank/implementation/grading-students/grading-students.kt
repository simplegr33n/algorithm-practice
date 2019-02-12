import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the gradingStudents function below.
 */
fun gradingStudents(grades: Array<Int>): ArrayList<Int> {
    /*
     * Write your code here.
     */
    val outputList = arrayListOf<Int>()

    for (i in grades.indices) {
            if (grades[i] <= 37) {
                outputList.add(grades[i])
            } else {
                if ((grades[i] % 5) > 2) {
                    var adjustedGrade = grades[i] + (5 - (grades[i] % 5))
                    outputList.add(adjustedGrade)
                } else {
                    outputList.add(grades[i])
                }
        }
    }

    return outputList

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val grades = Array<Int>(n, { 0 })
    for (gradesItr in 0 until n) {
        val gradesItem = scan.nextLine().trim().toInt()
        grades[gradesItr] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}