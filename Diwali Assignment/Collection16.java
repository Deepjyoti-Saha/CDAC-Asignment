//Write a Java program to empty an hash set.

import java.util.*;

  public class Collection16 {
  public static void main(String[] args) 
{
   
     HashSet<String> hashSet1 = new HashSet<String>();
 
		  hashSet1.add("Violet");
		  hashSet1.add("Indigo");
		  hashSet1.add("Blue");
		  hashSet1.add("Green");
		  hashSet1.add("Yellow");
		  hashSet1.add("Orange");
		  hashSet1.add("Red");
		  
    System.out.println("Original Hash Set: " + hashSet1);
    
	
	// Remove all elements
    hashSet1.removeAll(hashSet1);
    System.out.println("Hash Set after removing all the elements "+hashSet1);   
   }
}
