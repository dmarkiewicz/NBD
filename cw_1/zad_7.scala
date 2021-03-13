val data = Map(
    "jajko" -> 10.0,
    "czekolada" -> 20.0,
    "cola" -> 80.0,
    "gruszka" -> 5.0
)

val price: Option[Double] = data.get("keczap")

// Nawet jeśli nie znajdziemy elementu to na option mozemy wywoływać kolejne operacje
// i nie dostaniemy błędów
val discountedPrice = price.map(_ * 0.9)

// Jeśli elementu nie było otrzymamy None
println(discountedPrice)

// Mozemy skorzystać z getOrElse aby zwrócić jakąś defaultową wartość
println(discountedPrice.getOrElse("Not found"))