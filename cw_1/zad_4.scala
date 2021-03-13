val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela");

def removeTrailingComa(str: String): String = {
    return str.replaceAll(", $", "").replaceAll("^, ", "")
}

def strFoldLeft(days: List[String]): String = {
    return removeTrailingComa(days.foldLeft("")((result, day) => result + day + ", "))
}

def strFoldRight(days: List[String]): String = {
    return removeTrailingComa(days.foldRight("")((result, day) => day + ", " + result))
}

def strFilterFoldLeft(days: List[String]): String = {
    return removeTrailingComa(
        days.foldLeft("")(
            (result, day) => if (day.startsWith("P")) result + day + ", " else result
        )
    )
}

println(strFoldLeft(days))
println(strFoldRight(days))
println(strFilterFoldLeft(days))