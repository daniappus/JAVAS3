package Graphics;

interface Figure 
{
 double area();

}

public class Rectangle implements Figure 
{
 protected double length;
 protected double width;

 public Rectangle(double length, double width) 
 {
  this.length = length;
  this.width = width;

 }

 public double area() 
 {
  return length * width;
 }


}
