class TraitImpl extends FirstTrait {
  /* def addNum[A](v1: Array[Int]): Int = {
    v1.reduce((x,y)=>x+y)
  }
*/
  /*override def addNum[A](v1: Array[A] => A): A = {
         // A => A
println("hi")


  }*/
  override def addNum(v1: Array[Int]): Int = {
    v1.reduce(_+_)
  }
}

object mainclass{
  def main(args: Array[String]): Unit = {

    var traitImpl = new TraitImpl

    println(traitImpl.addNum(Array(2,3,1,12,3,4)))



  }
}
