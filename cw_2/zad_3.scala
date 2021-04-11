case class Osoba(val firstName: String, val lastName: String)

val darek = Osoba("Darek", "Markiewicz")
val alan = Osoba("Alan", "Falan")
val marek = Osoba("Marek", "Mostowiak")
val robert = Osoba("Robert", "Lewandowski")

def hello(osoba: Osoba): String = osoba match {
    case Osoba("Darek", "Markiewicz") => "Hello Darek my old friend"
    case Osoba("Robert", "Lewandowski") => "Witamy szanownego pana Roberta"
    case Osoba("Marek", "Mostowiak") => "Panie Marku, milo pana widziec"
    case Osoba(firstName, lastName) => s"$firstName $lastName, witaj na przyjeciu" 
}

println(hello(darek))
println(hello(alan))
println(hello(marek))
println(hello(robert))