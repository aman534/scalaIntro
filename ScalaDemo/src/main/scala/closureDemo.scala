object closureDemo {

  var num =80;

  def myfunc(x:Int) : Int = x+num;

  def main(args: Array[String]): Unit = {
    num =0;
    println(myfunc(10))
  }

}
