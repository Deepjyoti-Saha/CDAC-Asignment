import java.util.*;

  public class Collection15 
{
  public static void main(String[] args) {
         
     HashSet<String> hashSet1 = new HashSet<String>();
		  
		  hashSet1.add("Violet");
		  hashSet1.add("Indigo");
		  hashSet1.add("Blue");
		  hashSet1.add("Green");
		  hashSet1.add("Yellow");
		  hashSet1.add("Orange");
		  hashSet1.add("Red");

  // set Iterator 
    Iterator<String> p = hashSet1.iterator();
  
  // Iterate the hash set
   while (p.hasNext()) 
   {
   System.out.println(p.next());
   }
   }
}
