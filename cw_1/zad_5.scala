val data = Map(
    "jajko" -> 10.0,
    "czekolada" -> 20.0,
    "cola" -> 80.0,
    "gruszka" -> 5.0
)

def discountPrices(prices: Map[String, Double]): Map[String, Double] = {
    return prices.transform((key, value) => value * 0.9)
}

println(discountPrices(data))
