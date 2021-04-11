def answer(number: Int, fn: Int => Int) = fn(fn(fn(number)))

println(answer(10, (num: Int) => num + 1))