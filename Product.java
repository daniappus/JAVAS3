import java.util.*;
class product
{
 int pcode;
 String pname;
 float price;
 
 void getdata()
 {
  System.out.println("Enter Code, Name and Price of the Product: ");
  Scanner sc=new Scanner(System.in);
  this.pcode=sc.nextInt();
  sc.nextLine();
  this.pname=sc.nextLine();
  this.price=sc.nextFloat();
 }
 
 void display()
 {
  System.out.println("Product code: "+pcode);
  System.out.println("Product Name: "+pname);
  System.out.println("Product Price: "+price);
 }
}

class Product
{
 public static void main(String args[])
 {
  product P1=new product();
  product P2=new product();
  product P3=new product();
  P1.getdata();
  P1.display();
  P2.getdata();
  P2.display();
  P3.getdata();
  P3.display();
  
  if((P1.price<P2.price) && (P1.price<P3.price))
  {
   System.out.println(P1.pname+" have the lowest price");
  }
  else if((P2.price<P1.price) && (P2.price<P3.price))
  {
   System.out.println(P2.pname+" have the lowest price");
  }
  else
  {
   System.out.println(P3.pname+" have the lowest price");
  }
 }
}
