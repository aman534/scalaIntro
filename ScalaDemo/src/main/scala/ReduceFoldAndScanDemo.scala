object ReduceFoldAndScanDemo {

  val lst = List(1,3,-4)
  def main(args: Array[String]): Unit = {
    println(lst.reduce(_+_))
    println(lst.reduce((a,b)=> {println(a+" "+b);a+b}))

    println(lst.reduceLeft(_+_)) // output will be same as reduce

    println(lst.reduce(_-_))
    println(lst.reduceLeft(_-_))
    println(lst.reduceRight(_-_)) // this will start subtraction from right most element and then appnend the result in right most element

//--------------------Fold method------------------
//fold method takes initial argument start the list while adding or subtracting or any binary operation
    println(lst.fold(10)(_-_))
    println(lst.foldLeft(10)(_-_))
    println(lst.foldRight(10)(_-_))

    println(lst.fold(30)(_+_))

    println(lst.foldLeft(5)(_*_))
    println(lst.foldRight(5)(_*_))

    //----------------------Scan method-----------------

    //scan method print the intermediate result of operation in list form with taking the same initial argument

    println(lst.scan(10)(_+_))

    println(lst.scan(1)((a,z)=> a/z))

    println(lst.scanLeft(5)(_*_))

    println(lst.scanRight(5)(_*_))

  }

}
