class KontoBankowe(var stanKonta: Long = 0) {
    def wplata(amount: Long): Unit = {
        this.stanKonta += amount
    }

    def wyplata(amount: Long): Unit = {
        if (this.stanKonta >= amount) {
            this.stanKonta -= amount
        } else {
            throw new Exception("Brak wystarczających środków na wypłatę")
        }
    }
}

val konto1 = new KontoBankowe()
assert(konto1.stanKonta == 0)
konto1.wplata(1000)
konto1.wplata(250)
assert(konto1.stanKonta == 1250)
konto1.wyplata(500)
assert(konto1.stanKonta == 750)



val konto2 = new KontoBankowe(500)
assert(konto2.stanKonta == 500)