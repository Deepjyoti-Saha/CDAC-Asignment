import java.util.*;
  public class collection5 
{
  public static void main(String[] args) {
 
  List<String> list1 = new ArrayList<String>();
  list1.add("Violet");
  list1.add("Indigo");
  list1.add("Blue");
  list1.add("Green");
  list1.add("Yellow");
  list1.add("Orange");
  list1.add("Red");
  System.out.println("List before reversing :\n" + list1);  
  Collections.reverse(list1);
  System.out.println("List after reversing :\n" + list1); 
 }
}