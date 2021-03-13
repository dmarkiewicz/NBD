val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela");

def str(result: String, days: List[String]): String = {
    if (days.length == 1) {
        return result + days.head
    }

    return str(result + days.head + ", ", days.tail)
}

println(str("", days))