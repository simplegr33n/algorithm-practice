

// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {
    return getCalendarDay(year)
}

fun getCalendarDay(year: Int): String {
    val daysInMonths = arrayListOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    when (year) {
        1918 -> {
            daysInMonths[1] = 15
        }
        else -> {
            if (checkLeapYear(year)) {
                daysInMonths[1] = 29
            }
        }
    }
    var dd = ""
    var mm = ""

    var sumDays = 0
    for (month in daysInMonths.indices) {

        if ((sumDays + daysInMonths[month]) < 256) {
            sumDays += daysInMonths[month]
        } else {
            mm = (month + 1).toString()
            dd = (256 - sumDays).toString()
            break
        }
    }

    if (mm.length < 2) {
        mm = "0$mm"
    }

    if (dd.length < 2) {
        dd = "0$dd"
    }

    return "$dd.$mm.$year"
}

fun checkLeapYear(year: Int): Boolean {
    when (year) {
        in 1919..2700 -> {
            if (year % 400 == 0) {
                return true
            }
            if ((year % 4 == 0) && (year % 100 != 0)) {
                return true
            }
        }
        in 1700..1917 -> {
            if (year % 4 == 0) {
                return true
            }
        }
        else -> return false
    }
    return false
}



fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
