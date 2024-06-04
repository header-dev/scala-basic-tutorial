case object LoopWhileObj {
  def main(args: Array[String]): Unit = {
    var a = 10;
    while(a <= 100) {
      println(a);
      a = a + 1;
    }
  }
}