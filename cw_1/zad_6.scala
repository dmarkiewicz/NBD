def productInfo(tuple: (String, Int, Boolean)): Unit = {
    val (product, price, isAvailable) = tuple
    val available = if (isAvailable) "Dostępna" else "Nie dostępna"

    println(product + ": " + price + " PLN (" + available + ")")
}

productInfo(("czekolada", 80, false))