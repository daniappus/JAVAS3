package Graphics;

interface Figure 
{
 double area();
 void display();
}

public class Square implements Figure 
{
 private double side;

 public Square(double side) 
 {
  this.side = side;
 }
 
 public double area() 
 {
  return side * side;
 }

 public void display() 
 {
  System.out.println("Square [side=" + side + "]");
 }
}
