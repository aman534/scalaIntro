import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User

//getter setter available
class Student(var name:String,var age:Int)

//this is default var constructoe => no getter setter available
class MyStud(name:String,age:Int)

//no setter available
class Valclass(val name:String,val age:Int)

class privateClass(private var name:String,age:Int){
  def getName={
    name
  }
}

//auxillary constructor example..

class User(name:String,age:Int){
  def this(){
    this("tom",32)
  }

  def this(name:String){
    //this()
    this(name,44)
  }
}


object Myobj{
  def main(args: Array[String]): Unit = {

  }
}