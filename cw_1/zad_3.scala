val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela");

def str(days: List[String]): String = {
    @annotation.tailrec
    def iter(result: String, days: List[String]): String = {
        if (days.length == 1) {
            return result + days.head
        }
        
        return iter(result + days.head + ", ", days.tail)
    }

    iter("", days)
}

println(str(days))