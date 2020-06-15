object Demo {

  val res = (v1:String,v2:String) => v1.toString.concat(v2.toString)

  def myfunc(arg1:Int)  = {
    arg1*0.76
  }

  def currFunc(arg1 : Int)(var2 : Double)  = {
    arg1 + var2;
  }
  def main(args: Array[String]): Unit = {
    for ( i <- 1 to 10 if i %2 == 0){
      println(i)
    }

    val checkRes = (x : AnyVal) => x==2
    val temp = res.apply("aman",_)
    println(temp.apply("Agrawal"))

     println(myfunc(3))
    println(checkRes.apply(8.0))

    val currVal = currFunc(4)_
    println(currVal)
    println(currVal(4.5))

   // println(tuple3ToZippedOps("hi",4,90).->())

    val myclassObj = Myclass("hello")
    var name = myclassObj.getName

    myclassObj.matchName(name)
    //myclassObj.getName.fold(x=>println(x))

    val arr : Array[Int] = Array(3,2,1,4,2,9)
    println(arr.toSeq.iterableFactory.range(0,5,3))

    var student = new Student("AMan",27);
    println(student.age)
    println(student.name)
    student = new Student("Rajat",35)
    println(student.name)
  }

}
