val data = List(0, 1, 2, 3, 0, 4, 5, 0, 6, 7, 0, 8, 9, 0)

def removeZeros(numbers: List[Int]): List[Int] = {
    return numbers.filter(_ != 0)
}

println(removeZeros(data))