import java.util.*;
public class StringList
{
 public static void main(String args[])
 {
  ArrayList<String> st=new ArrayList<>();
  Scanner sc=new Scanner(System.in);
  st.add("Apple");
  st.add("Orange");
  st.add("Banana");
  st.add("Kiwi");
  System.out.println("Initial List: "+st);
  System.out.print("Enter an element to add to the list: ");
  String ele = sc.nextLine();
  st.add(ele);
  System.out.println("List after adding element "+st);
  st.remove("Orange");
  System.out.println("List after removing element: "+st);
  Collections.sort(st);
  System.out.println("List after sorting: "+st);
  System.out.println("Enter an element to search: ");
  String search = sc.nextLine();
  if(st.contains(search))
  {
   System.out.println("Element "+search+" found in the list");
  }
  else
  {
   System.out.println("Element "+search+" not found in the list");
  }
  System.out.println("Total number of elements in the list: "+st.size());
 }
}
