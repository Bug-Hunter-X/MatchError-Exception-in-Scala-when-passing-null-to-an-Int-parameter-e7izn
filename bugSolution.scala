```scala
class MyClass(val x: Int) {
  def myMethod(y: Option[Int]): Int = {
    y match {
      case Some(value) => x + value
      case None => x //Or handle the None case in another appropriate way
    }
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(Some(10))) // Output: 15
  println(obj.myMethod(None)) // Output: 5 (or handle None case differently)
}
```