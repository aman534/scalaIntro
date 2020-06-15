object OptionDemo {

val option = Option(78)
  def getNum(v1:Int) :Option[Double] ={
    if(v1 %2 ==0)
      Some(math.random())
    else
      None
  }


  def main(args: Array[String]): Unit = {
        println(getNum(9))
    println(option)
    }

}
