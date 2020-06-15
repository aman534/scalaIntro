import java.util.Locale

import scala.collection.immutable

object ListMapFlatMapFlattenDemo {

  var lst = scala.collection.immutable.List(12,13,14,15,16)
  val set =scala.collection.mutable.LinkedHashSet(3,4,2,1,4)
  val map = Map(1->"Aman",2->"Rajat",4->null)

  def main(args: Array[String]): Unit = {
    println(lst.map(_*2))
    //equivalent to
    println(lst.map(x=>x*2))

    println(lst.flatMap(x=>List(x , x + 1)))

    //println(lst.flatMap(List(_,_+1))

    println(lst.filter(x => x%2==0))
    println(lst.filter(_%2==0))

    println(List(List(2,3),List(4,5),List(6,7)).flatten)

    println(map.view.mapValues(x=> "Hi "+ x).foreach(x=>println(x._2)))

    println(map.mapValues(x=> "Hi "+x).toMap)

    for(i <- 0 to lst.size){
      println(lst ::: immutable.List(290,90))
    }

    for( i<- 0 to set.size)
      set.addOne(5 + i)

    println(lst.zip(set).toMap)
    println(set)
  }

}
