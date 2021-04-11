val weekDays = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek");
val weekendDays = List("Sobota", "Niedziela");

def answer(day: String): String = day match {
    case day: String if weekDays.contains(day) => "Praca"
    case day: String if weekendDays.contains(day) => "Weekend"
    case _ => "Nie ma takiego dnia"
}


println("Poniedzialek" + " -> " + answer("Poniedzialek"))
println("Czwartek" + " -> " + answer("Czwartek"))
println("Sobota" + " -> " + answer("Sobota"))
println("Kek" + " -> " + answer("Kek"))