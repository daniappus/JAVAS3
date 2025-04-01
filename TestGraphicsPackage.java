import Graphics.*;

public class TestGraphicsPackage 
{
 public static void main(String[] args) 
 {
  Rectangle rectangle = new Rectangle(5, 3);
  Square square = new Square(4);
  Triangle triangle = new Triangle(3, 4, 5);
  Circle circle = new Circle(2.5);

  System.out.println("TESTING GRAPHICS PACKAGE");
  System.out.println("\nArea of Rectangle: "+rectangle.area());
  System.out.println("\n");
  square.display();
  System.out.println("Area of Square: "+square.area());
  System.out.println("\n");
  triangle.display();
  System.out.println("Area of Triangle: "+triangle.area());
  circle.display();
  System.out.println("\nArea of Circle: "+circle.area());

 }
}
