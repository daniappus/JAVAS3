import java.util.*;
class AreaCalc{
 double calculateArea(double radius)
 {
  return Math.PI * radius * radius;
 }
 
 double calculateArea(double length, double width)
 {
  return length * width;
 }
 
 double calculateArea(double base1, double base2, double height)
 {
  return 0.5*(base1+base2) * height;
 }
 int calculateArea(int length)
 {
  return length*length;
 }
}

class AreaMain
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  AreaCalc ac = new AreaCalc();
  
  System.out.print("Enter radius of the circle: ");
  double radius = sc.nextDouble();
  System.out.println("Area of Circle with radius ("+radius+") : "+ac.calculateArea(radius));
  System.out.print("Enter length of the rectangle: ");
  double length = sc.nextDouble();
  System.out.print("Enter width of the rectangle: ");
  double width = sc.nextDouble();
  System.out.println("Area of Rectangle with length("+length+") and width("+width+") is: "+ac.calculateArea(length,width));
  System.out.print("Enter base 1 of trapezoid: ");
  double base1 = sc.nextDouble();
  System.out.print("Enter base 2 of trapezoid: ");
  double base2 = sc.nextDouble();
  System.out.print("Enter height of trapezoid: ");
  double height = sc.nextDouble();
  System.out.println("Area of Trapezoid with Base("+base1+"), Base("+base2+") and Height("+height+") is: "+ac.calculateArea(base1,base2,height));
  System.out.print("Enter length of Square: ");
  int lengthsq = sc.nextInt();
  System.out.println("Area of Square with Length ("+lengthsq+") : "+ac.calculateArea(lengthsq));
 }
}
  
