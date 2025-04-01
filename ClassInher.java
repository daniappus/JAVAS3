import java.util.*;
class Person
{
  String name,gender,address;
  int age;
  Person(String name,String gender,String address,int age)
  {
    this.name=name;
    this.gender=gender;
    this.address=address;
    this.age=age;
  }
}
class Employee extends Person
{
  int empid,salary;
  String company_name,qualification;
  Employee(String name,String gender,String address,int age,int empid,int salary,String company_name,String qualification)
  {
    super(name,gender,address,age);
    this.empid=empid;
    this.salary=salary;
    this.company_name=company_name;
    this.qualification=qualification;
  }
}
class Teacher extends Employee
{
  int teacherid;
  String subject,department;
  Teacher(String name,String gender,String address,int age,int empid,int salary,String company_name,String qualification,int teacherid,String subject,String department)
  {
    super(name,gender,address,age,empid,salary,company_name,qualification);
    this.teacherid=teacherid;
    this.subject=subject;
    this.department=department;
  }
  void display()
  {
   System.out.println("\nTeacher Details");
   System.out.println("Name: "+name);
   System.out.println("Gender: "+gender);
   System.out.println("Address: "+address);
   System.out.println("Age: "+age);
   System.out.println("Employee ID: "+empid);
   System.out.println("Company Name: "+company_name);
   System.out.println("Qualification: "+qualification);
   System.out.println("Salary: "+salary);
   System.out.println("Subject: "+subject);
   System.out.println("Department: "+department);
   System.out.println("Teacher ID: "+teacherid);
  }
}
class ClassInher
{
  public static void main(String args[])
  {
    String name,gender,address,company_name,qualification,subject,department;
    int age,empid,salary,teacherid;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of Teachers:");
    int n=sc.nextInt();
    sc.nextLine();
    Teacher[] t= new Teacher[n];
    for(int i=0;i<n;i++)
    {
    System.out.println("\nEnter Details of Teacher "+(i+1)+" : ");
    System.out.println("Enter name:");
    name=sc.nextLine();
    System.out.println("Enter gender:");
    gender=sc.nextLine();
    System.out.println("Enter address:");
    address=sc.nextLine();
    System.out.println("Enter age:");
    age=sc.nextInt();
    System.out.println("Enter Employee id:");
    empid=sc.nextInt();
    System.out.println("Enter Salary:");
    salary=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Company name:");
    company_name=sc.nextLine();
    System.out.println("Enter Qualification:");
    qualification=sc.nextLine();
    System.out.println("Enter Teacher id:");
    teacherid=sc.nextInt();
    subject=sc.nextLine();
    System.out.println("Enter Subject:");
    subject=sc.nextLine();
    System.out.println("Enter Department:");
    department=sc.nextLine();
    t[i]=new Teacher(name, gender, address, age, empid, salary, company_name, qualification, teacherid, subject, department);
    }
    System.out.println("\nTeacher Information");
    for(Teacher teacher : t)
    {
     teacher.display();
    }
    }
}   
    
    
    
    
    
       
  
