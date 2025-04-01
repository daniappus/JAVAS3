import java.util.*;

interface Shape
{
 double area();
 double perimeter();
}

class Circle implements Shape
{
 private double radius;
 Circle(double radius)
 {
   this.radius = radius;
 }
 
 public double area()
 {
  double a=Math.PI * radius * radius;
  return a;
 }
 
 public double perimeter()
 {
  double p = 2 * Math.PI * radius;
  return p;
 }
}

class Rectangle implements Shape
{
 private double length,width;
 Rectangle(double length, double width)
 {
  this.length=length;
  this.width=width;
 }
 public double area()
 {
  return length*width;
 }
 
 public double perimeter()
 {
  return 2*(length+width);
 }
}

class shape
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int choice = 0;
  
  while(choice != 3)
  {
   System.out.println("\nShape Calculator Menu");
   System.out.println("1. Calculate for Circle");
   System.out.println("2. Calculate for Rectangle");
   System.out.println("3. Exit");
   System.out.print("Enter your choice (1-3): ");
   choice = sc.nextInt();
   
   switch(choice)
   {
    case 1:
     System.out.println("\nCalculate Area and Perimeter of Circle"); 
     System.out.print("Enter radius of Circle: ");
     double radius = sc.nextDouble();
     Circle circle = new Circle(radius);
     System.out.println("The Area of Circle with Radius "+radius+" is: "+circle.area());
     System.out.println("The Perimeter of Circle with Radius "+radius+" is: "+circle.perimeter());
     break;
     
    case 2:
     System.out.println("\nCalculate Area and Perimeter of Rectangle"); 
     System.out.print("Enter length of Rectangle: ");
     double length = sc.nextDouble();
     System.out.print("Enter breadth of Rectangle: ");
     double breadth = sc.nextDouble();
     Rectangle rectangle = new Rectangle(length, breadth);
     System.out.println("The Area of Rectangle with Length "+length+" and Breadth "+breadth+" is: "+rectangle.area());
     System.out.println("The Perimeter of Rectangle with Length "+length+" and Breadth "+breadth+" is: "+rectangle.perimeter());
     break;
     
    case 3:
     System.out.println("Exiting the program.");
     return;

    default:
     System.out.println("Invalid choice! Please select a choice between(1-3)!");
   }
  }
 }
}
     
     
 
