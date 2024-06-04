object HigherOrderFuncObj {

  def main(args: Array[String]): Unit = {
    functionExample(25, multiplyBy2)
  }

  def functionExample(a:Int, f:Int=>AnyVal): Unit = {
    println(f(add2(a)))
  }

  def add2(a:Int):Int = {
    a+2
  }

  def multiplyBy2(a:Int): Int = {
    a*2
  }

}
