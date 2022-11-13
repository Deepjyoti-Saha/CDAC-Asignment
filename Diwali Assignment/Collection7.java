import java.util.ArrayList;
  public class Collection7
{
    public static void main(String[] args) {
  ArrayList <String> list1 = new ArrayList <String> ();
  list1.add("Violet");
  list1.add("Indigo");
  list1.add("Blue");
  list1.add("Green");
  list1.add("Yellow");
  list1.add("Orange");
  list1.add("Red");
  System.out.println("\nOriginal array list: " + list1);
  System.out.println("\nPrint using index of an element: ");
  int numElements = list1.size();
  for (int i = 0; i < numElements; i++)
   System.out.println(list1.get(i));
 }
}