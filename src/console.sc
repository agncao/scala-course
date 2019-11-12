def sum(i: Int)(j: Int)(k: Int): Int ={
  i + j + k
}
val result = sum _
val r = result(2)(3)(4)
println(r)

val r1 = result(1)//返回一个function1
println(r1)
val r2 = result(2)(_: Int)(4)
println(r2)//返回一个function1
