package Graphics;

interface Figure 
{
 double area();
 void display();
}

public class Circle implements Figure 
{
 private double radius;
 
 public Circle(double radius) 
 {
  this.radius = radius;
 }

 public double area() 
 {
  return Math.PI * radius * radius;
 }
 
 public void display()
 {
  System.out.println("Raidus of Circle: "+radius);
 }

}
