val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela");

def strA(days: List[String]): String = {
    if (days.length == 1) {
        return days(0)
    }

    return days.head + ", " + strA(days.tail)
}

def strB(days: List[String]): String = {
    if (days.length == 1) {
        return days(0)
    }

    return days.last + ", " + strB(days.dropRight(1))
}

println(strA(days))
println(strB(days))