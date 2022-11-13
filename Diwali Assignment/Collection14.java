import java.util.*;
  public class Collection14 
{
  public static void main(String[] args) {
          LinkedList<String> list1= new LinkedList<String>();
		  list1.add("Violet");
		  list1.add("Indigo");
		  list1.add("Blue");
		  list1.add("Green");
		  list1.add("Yellow");
		  list1.add("Orange");
		  list1.add("Red");
          System.out.println("Original linked list: " + list1);
          
		  // Replacing 4th element with new value
          list1.set(3, "NewValue");
          System.out.println("New linked list: " + list1);
   }
}
