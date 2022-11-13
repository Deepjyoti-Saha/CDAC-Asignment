import java.util.*;
  public class Collection3
{
  public static void main(String[] args) {
  // Creae a list and add some colors to the list
  List<String> list1 = new ArrayList<String>();
  list1.add("Violet");
  list1.add("Indigo");
  list1.add("Blue");
  list1.add("Green");
  list1.add("Yellow");
  list1.add("Orange");
  list1.add("Red");
  // Retrive the fourth element

  String element = list1.get(3);
  System.out.println("4th element: "+element);
 }
}
