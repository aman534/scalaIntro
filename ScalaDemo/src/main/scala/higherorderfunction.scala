object higherorderfunction {

  def high_func(v1:Int,v2:Int,v3:Int,f:(Int, Int) => Int) = f(v3,f(v1,v2))
  def main(args: Array[String]): Unit = {
    val partres = high_func(3,5,7,(x,y)=>x+y)


    println(high_func(2,1,3,_ + _))
     // println(partres)


  }

}
