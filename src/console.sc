import com.lessons.scala.oo.clz.Var
import com.lessons.scala.oo.pattern.UnOp


val expr = UnOp("abs", UnOp("abs", Var("x")))
expr match {
  case UnOp("abs", e@UnOp("abs", i@Var(_))) => println(e + " " + i)
  case _ =>
}
