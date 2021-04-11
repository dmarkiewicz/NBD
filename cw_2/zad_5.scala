abstract class Osoba(val imie: String, val nazwisko: String) {
    def podatek: Double;
}

trait Student extends Osoba {
    override def podatek: Double = 0.0
}

trait Pracownik extends Osoba {
    private var _pensja: Double = 0
    def pensja = _pensja
    def pensja_= (value: Double): Unit = _pensja = value
    
    override def podatek = pensja * 0.2
}

trait Nauczyciel extends Pracownik {
    override def podatek = pensja * 0.1
}

val student = new Osoba("Arek", "Skwarek") with Student
println(s"Podatek studenta: ${student.podatek}")

val pracownik = new Osoba("Arek", "Talarek") with Pracownik
pracownik.pensja = 2000
println(s"Podatek pracownika: ${pracownik.podatek}")


val nauczyciel = new Osoba("Arek", "Malarek") with Nauczyciel
nauczyciel.pensja = 2000
println(s"Podatek nauczyciela: ${nauczyciel.podatek}")


val pracownikoStudent = new Osoba("Pracownik", "Student") with Pracownik with Student
pracownikoStudent.pensja = 2000
println(s"Podatek pracowniko-studenta: ${pracownikoStudent.podatek}")



val studentoPracownik = new Osoba("Student", "Pracownik") with Student with Pracownik
studentoPracownik.pensja = 2000
println(s"Podatek studento-pracownika: ${studentoPracownik.podatek}")
