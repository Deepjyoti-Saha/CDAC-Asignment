//Write a Java program to convert a hash set to an array.

import java.util.*;
  public class Collection17 {
  public static void main(String[] args) {
         
     HashSet<String> hashSet1 = new HashSet<String>();
   
          hashSet1.add("Red");
          hashSet1.add("Green");
          hashSet1.add("Black");
          hashSet1.add("White");
          hashSet1.add("Pink");
          hashSet1.add("Yellow");
      System.out.println("Original Hash Set: " + hashSet1);
     
      String[] array = new String[hashSet1.size()];
      hashSet1.toArray(array);
 
     // Displaying Array elements
     System.out.println("Array elements: ");
      for(String x : array){
        System.out.println(x);
     }
   }
}
