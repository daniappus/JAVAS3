import java.util.*;
class StringOp {
 public static void main(String args[]) {
  Scanner sc = new Scanner(System.in); 
  System.out.print("Enter first string: ");
  String str1 = sc.nextLine();

  System.out.print("Enter second string: ");
  String str2 = sc.nextLine();
  String copyStr1 = str1;
  
  System.out.println("\nCopied Strings:");
  System.out.println("Copy of First String: " + copyStr1);

  System.out.println("\nString Comparison:");
  if (str1.equals(str2)) {
   System.out.println("Both strings are equal.");
  } else {
   System.out.println("Strings are not equal.");
  }
  System.out.println("\nLength of Strings:");
  System.out.println("Length of First String: " + str1.length());
  System.out.println("Length of Second String: " + str2.length());
  System.out.println("\nString Concatenation:");
  System.out.println("Concatenated String: " + str1.concat(" ").concat(str2));
 }
}

