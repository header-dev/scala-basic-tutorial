object FuncObj {

  def main(args: Array[String]): Unit = {

    println("Example : Simple Function")
    functionExample()

    println("Example : Return Function")
    var result = funcReturnExample()
    println(result)

    println("Example : Using Params Function")
    funcParamExample(10, 20)

    println("Example : Recursive Function")
    var result1:Int = funcRecursiveExample(15,2)
    println(result1)


    var result2:Int = funcDefaultParamExample(15,2);
    var result3:Int = funcDefaultParamExample(15)
    var result4:Int = funcDefaultParamExample()
    println("Example : Default Params Function")
    println(result2+"\n"+result3+"\n"+result4)

  }

  def functionExample(): Unit = {
    println("This is simple function")
  }

  def funcReturnExample() = {
    var a = 10
    a
  }

  def funcParamExample(a: Int, b: Int) = {
    var c = a+b
    println(c)
  }

  // Recursive Function
  def funcRecursiveExample(a: Int, b: Int): Int = {
    if(b == 0)
      0
    else
      a+funcRecursiveExample(a,b-1)
  }

  def funcDefaultParamExample(a:Int = 0, b:Int = 0):Int = {
    a+b;
  }

}
