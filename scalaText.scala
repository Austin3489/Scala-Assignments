import scala.io.Source
import scala.collection.mutable.HashMap
import scala.collection.immutable.ListMap
var totalUnique = 0;
                //Below we get a file-handler for the file “items.txt”
def story1() {  var mymap = Map[String, Int]()
				var totalmap = Map[String, Int]()
				val lineIterator =  Source.fromFile("story1.txt").getLines;
               //Iterate over all lines
                for(line <- lineIterator){
                //line.split(" ").foreach{x=>println(x)}   
        mymap =  line.split(" ").groupMapReduce(_.toLowerCase)(_ => 1)(_ + _)
					
				totalmap =	(mymap.toSeq ++ totalmap).groupMapReduce(_._1)(_._2)(_+_)
				}
					//println(totalmap);
			var sortedmap = ListMap(totalmap.toSeq.sortWith(_._2 > _._2):_*)
					//println(sortedmap);
					var i = 0;
					
				for ((k,v) <- sortedmap){
					if(i == 4){
					println("\nFourth most frequent word in story 1: " + k + ". It occurs " + v + " times.");	
					}
					if(k != " " && k != "." && k != "!" && k != ","){
								i = i + 1;
					}
					
				}
				println("Total unique words in story 1: " + i);
			  totalUnique = totalUnique + i;
						 }


def story2() {
	var mymap = Map[String, Int]()
				var totalmap = Map[String, Int]()
				val lineIterator =  Source.fromFile("story2.txt").getLines;
               //Iterate over all lines
                for(line <- lineIterator){
                //line.split(" ").foreach{x=>println(x)}   
        mymap =  line.split(" ").groupMapReduce(_.toLowerCase)(_ => 1)(_ + _)
					
				totalmap =	(mymap.toSeq ++ totalmap).groupMapReduce(_._1)(_._2)(_+_)
				}
					//println(totalmap);
			var sortedmap = ListMap(totalmap.toSeq.sortWith(_._2 > _._2):_*)
					//println(sortedmap);
					var i = 0;
					
				for ((k,v) <- sortedmap){
					if(i == 4){
					println(" \nFourth most frequent word in story 2: " + k + ". It occurs " + v + " times.");	
					}
					if(k != " " && k != "." && k != "!" && k != ","){
								i = i + 1;
					}
					
				}
				println("Total unique words in story 2: " + i);
				totalUnique = totalUnique + i;

	
}
story1()
story2()
println(" \nTotal combined unique words: " + totalUnique);
