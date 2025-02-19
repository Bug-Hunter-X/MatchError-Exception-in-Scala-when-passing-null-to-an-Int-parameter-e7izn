```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y 
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(10)) //Expected output: 15
  println(obj.myMethod(null)) //This line throws a MatchError Exception
}
```