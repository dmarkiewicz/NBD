val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela");

def removeTrailingComa(str: String): String = {
    return str.replaceAll(", $", "")
}

def strA(days: List[String]): String = {
    var result = ""

    for (day <- days) {
        result += day + ", "
    }

    return removeTrailingComa(result)
}

def strB(days: List[String]): String = {
    var result = ""

    for (day <- days) {
        if (day.startsWith("P")) {
            result += day + ", "
        }
    }

    return removeTrailingComa(result)
}

def strC(days: List[String]): String = {
    var dayIndex = 0
    var result = ""

    while (dayIndex < days.length) {        
        result += days(dayIndex) + ", "
        dayIndex += 1
    }

    return removeTrailingComa(result)
}


println(strA(days))
println(strB(days))
println(strC(days))