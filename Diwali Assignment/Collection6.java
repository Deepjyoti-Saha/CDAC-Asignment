import java.util.ArrayList;
import java.util.Collections;
  public class Collection6 
{
  public static void main(String[] args) {
   ArrayList<String> list1= new ArrayList<String>();
		  list1.add("Violet");
		  list1.add("Indigo");
		  list1.add("Blue");
		  list1.add("Green");
		  list1.add("Yellow");
		  list1.add("Orange");
		  list1.add("Red");

          System.out.println("Array list before Swap:");
          for(String a: list1)
		  {
          System.out.println(a);
          }
          
		  //Swapping 1st(index 0) element with the 3rd(index 2) element
          Collections.swap(list1, 0, 2);
          System.out.println("\nArray list after swap:");
          for(String b: list1)
		  {
          System.out.println(b);
          }
     }
}
