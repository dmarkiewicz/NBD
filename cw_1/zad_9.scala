val data = List(0, 1, 2, 3, 0, 4, 5, 0, 6, 7, 0, 8, 9, 0)

def incrementAll(numbers: List[Int]): List[Int] = {
    return numbers.map(_ + 1)
}

println(incrementAll(data))