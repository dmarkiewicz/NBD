val data = List(0.0, 1.5, -2.0, -33, -6.0, -5.0, 5.0, 12.0, 12.1, 13.0, 19.0, 4.4, 0, -2.3)

def result(numbers: List[Double]): List[Double] = {
    return numbers
        .filter(num => num >= -5 && num <= 12)
        .map(_.abs)
}

println(result(data))