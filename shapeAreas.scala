import scala.math._
trait Shape{
  var color = "blue"
  
}
class Circle(var radius:Float) extends Shape {
	
 def area = { 
	val areaCircle = (3.14 * (radius * radius))
	 println(areaCircle)
	areaCircle
	 		   }


                   
}
class Square(var side:Float) extends Shape {
	
def area = {
	val areaSquare = side * side
	println(areaSquare)
	areaSquare
}
	

 
}
class Pentagon(var side:Float) extends Shape {
	
  def area = {
	val areaPentagon = (sqrt(5 * (5 + 2 * (sqrt(5)))) * side * side) / 4;
	  println(areaPentagon)
	 areaPentagon
}
}
val r = new scala.util.Random
println("Set area calculator value(radius or side length)")
var value = scala.io.StdIn.readInt();
var total:Double = 0;

for(i <- 0 until 25) {
  var x:Int = r.nextInt(3)
  if(x==0)
	{		
		var square1 = new Square(value); 
		println("Area of Square:")
      var s =  square1.area
		total += s
		s
	
	}
	else if(x==1){
		println("Area of Circle:")
		var circle1 = new Circle(value); 
		var c =  circle1.area
		total += c
		c
	
	}
	else{
		println("Area of Pentagon:")
		var pentagon1 = new Pentagon(value); 
		var p =  pentagon1.area
		total += p
		p
		
	}

}
println("Total Area: ")
println(total)


