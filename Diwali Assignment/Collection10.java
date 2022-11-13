import java.util.LinkedList;
  public class Collection10
{
  public static void main(String[] args) {
   
     LinkedList<String> list1 = new LinkedList<String>();
  
          list1.add("Red");
          list1.add("Green");
          list1.add("Black");
     System.out.println("Original linked list:" + list1);    
   
   // Add an element at the beginning 
    list1.addFirst("FirtInsertion");
 
   // Add an element at the end of list 
    list1.addLast("LastInsertion");
	
     System.out.println("Final linked list:" + list1);  
 }
}
