import java.util.*;

class MatrixDetails 
{
 int[][] arr1;
 int i;
 int j;
 int r;
 int c;


 public MatrixDetails(int r, int c)
 {
  this.r = r;
  this.c = c;
  arr1 = new int[r][c]; 
 }


 void getData(Scanner sc) 
 {
  System.out.println("Enter the elements of the array: ");
  for (i = 0; i < r; i++) 
  {
   for (j = 0; j < c; j++) 
   {
    arr1[i][j] = sc.nextInt();
   }
  }
 }


 void display() 
 {
  System.out.println("The array is: ");
  for (i = 0; i < r; i++) 
  {
   for (j = 0; j < c; j++) 
   {
    System.out.print(arr1[i][j] + " ");
   }
   System.out.println();
  }
 }


 public static MatrixDetails add(MatrixDetails a, MatrixDetails b) 
 {
  MatrixDetails result = new MatrixDetails(a.r, a.c); 
  for (int i = 0; i < a.r; i++) 
  {
   for (int j = 0; j < a.c; j++) 
   {
    result.arr1[i][j] = a.arr1[i][j] + b.arr1[i][j];
   }
  }
  return result;
 }


 public static MatrixDetails multiply(MatrixDetails a, MatrixDetails b) 
 {
  MatrixDetails result = new MatrixDetails(a.r, b.c);
  for (int i = 0; i < a.r; i++) 
  {
   for (int j = 0; j < b.c; j++) 
   {
    result.arr1[i][j] = 0;
    for (int k = 0; k < a.c; k++) 
    {
     result.arr1[i][j] += a.arr1[i][k] * b.arr1[k][j]; 
    }
   }
  }
  return result;
 }
}

public class Matrix 
{
 public static void main(String args[]) 
 {
  int r, c;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of rows in the array: ");
  r = sc.nextInt();
  System.out.println("Enter the size of columns in the array: ");
  c = sc.nextInt();
  MatrixDetails m1 = new MatrixDetails(r, c);
  MatrixDetails m2 = new MatrixDetails(r, c);
  m1.getData(sc);
  m1.display();
  m2.getData(sc);
  m2.display();
  System.out.println("Addition of matrices: ");
  MatrixDetails resultAdd = MatrixDetails.add(m1, m2);
  resultAdd.display();
  System.out.println("Multiplication of matrices: ");
  MatrixDetails resultMul = MatrixDetails.multiply(m1, m2);
  resultMul.display();
 }
}

