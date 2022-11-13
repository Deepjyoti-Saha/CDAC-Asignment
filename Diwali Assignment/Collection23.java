import java.util.*;

  public class Collection23 {
  public static void main(String[] args) {

  
           PriorityQueue<String> pq1 = new PriorityQueue<String>();  
   
		  pq1.add("Violet");
		  pq1.add("Indigo");
		  pq1.add("Blue");
		  pq1.add("Green");
		  pq1.add("Yellow");
		  pq1.add("Orange");
		  pq1.add("Red");
    System.out.println("Original Priority Queue: "+pq1);
   
   //Convert a linked list to array list    
   List<String> array_list = new ArrayList<String>(pq1);
   System.out.println("Array containing all of the elements in the queue: "+array_list);
    
   }    
}
