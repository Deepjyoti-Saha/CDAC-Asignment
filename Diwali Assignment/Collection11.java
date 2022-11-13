//Write a Java program to display the elements and their positions in a linked list.

import java.util.LinkedList;
import java.util.Iterator;
  public class Collection11
{
  public static void main(String[] args) {
   
     LinkedList<String> list1 = new LinkedList<String>();
   
		  list1.add("Violet");
		  list1.add("Indigo");
		  list1.add("Blue");
		  list1.add("Green");
		  list1.add("Yellow");
		  list1.add("Orange");
		  list1.add("Red");
      
      
   System.out.println("Original linked list:" + list1);  
  
  for(int i=0; i < list1.size(); i++)
   {
      System.out.println("Element at index "+i+": "+list1.get(i));
   } 
 }
}
