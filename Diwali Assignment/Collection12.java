import java.util.*;
public class Collection12
{
 public static void main(String[] args) {
  
  LinkedList <String> list1 = new LinkedList <String> ();
		  list1.add("Violet");
		  list1.add("Indigo");
		  list1.add("Blue");
		  list1.add("Green");
		  list1.add("Yellow");
		  list1.add("Orange");
		  list1.add("Red");
          System.out.println("Original linked list: " + list1);
           
     // Checks whether the color "Blue" exists or not.
    if (list1.contains("Blue")) 
	{
       System.out.println("Color Blue is present in the linked list.");
    } 
	else
	{
       System.out.println("Color Blue is not present in the linked list.");
    }
    
 
    
 }
}
