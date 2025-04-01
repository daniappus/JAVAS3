package Graphics;

interface Figure 
{
 double area();
 void display();
}

public class Triangle implements Figure 
{
 private double a;
 private double b;
 private double c;

 public Triangle(double a, double b, double c) 
 {
  this.a = a;
  this.b = b;
  this.c = c;
 }

 public double area() 
 {
  double s = (a + b + c) / 2;
  return Math.sqrt(s * (s - a) * (s - b) * (s - c));
 }

 public void display() 
 {
  System.out.println("Triangle [sides=" + a + ", " + b + ", " + c + "]");
 }

}
