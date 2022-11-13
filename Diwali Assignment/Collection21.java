import java.util.*;
  public class Collection21 
{
  public static void main(String[] args) {
   // Create Priority Queue
           PriorityQueue<String> pq1 = new PriorityQueue<String>();  
   
		  pq1.add("Violet");
		  pq1.add("Indigo");
		  pq1.add("Blue");
		  pq1.add("Green");
		  pq1.add("Yellow");
		  pq1.add("Orange");
		  pq1.add("Red");
  
    System.out.println("Original Priority Queue: "+pq1);
   
   // Removing all the elements from the Priority Queue
    pq1.clear();
 
    System.out.println("The New Priority Queue: " + pq1);
  } 
}
