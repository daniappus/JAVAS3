import java.util.*;
class Cpu
{
 int price;
 Scanner sc=new Scanner(System.in);
 Cpu()
 {
  System.out.println("Enter the CPU price: ");
  price=sc.nextInt();
 }
 class Processor
 {
  int core;
  String manufacturer;
  Processor()
  {
   System.out.println("Enter the number of cores in CPU: ");
   core=sc.nextInt();
   sc.nextLine();
   System.out.println("Enter the manufacturer name: ");
   manufacturer=sc.nextLine();
  }
 }
 static class RAM
 {
  int memory;
  RAM()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the RAM in GB: ");
   memory=sc.nextInt();
  }
 }
 
 public static void main(String args[])
 {
  Cpu c=new Cpu();
  Cpu.Processor p=c.new Processor();
  Cpu.RAM r=new Cpu.RAM();
  
  System.out.println("CPU price: "+c.price+"\nNumber of cores: "+p.core+"\nManufacturer name: "+p.manufacturer+"\nRAM in GB: "+r.memory);
 }
} 
  
  
