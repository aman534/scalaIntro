case class Myclass(v1:String) {
  def getName   = {
    v1
  }

  def matchName(v1:String) = {
    v1 match {
      case "Aman" => println("match case passed")
      case "hello" => println("hello match case"+ v1)
      case _ => println("default")
    }
  }

}

//class TraitImpl with
