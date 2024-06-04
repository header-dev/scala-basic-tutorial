import scala.util.control.Breaks._

object BreakStatementObj {
  def main(args: Array[String]): Unit = {
    breakable {
      for(i<-1 to 10 by 2) {
        if(i==7)
          break
        else
          println(i)
      }
    }

    for(i<-1 to 3) {
      breakable{
        for(j<-1 to 3){
          if (i==2 & j ==2)
            break;
          println(i+" "+j)
        }
      }
    }

  }
}
