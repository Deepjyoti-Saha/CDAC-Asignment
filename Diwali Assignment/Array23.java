import java.util.*;
 

class Array23 {
 
 
    public static void main(String[] args)
    {
 
        
        ArrayList<String> al = new ArrayList<String>();
 
        
        al.add("Hello");
        al.add("everyone");
        al.add("Have a");
        al.add("nice day");
 
       
        String k[] = al.toArray(new String[al.size()]);
 
       
        for (String str : k) {
 
          
            System.out.println(str);
        }
    }
}