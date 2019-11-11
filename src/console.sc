val someNumbers = List(-11, -10, -5, 0, 5, 10)
println(someNumbers)
someNumbers.foreach(println _)
val output: () => Unit = println _
someNumbers.foreach(output.apply(_))






