import java.util.LinkedList;
public class Collection9 
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
		
		
		
		list1.add(3, "New entry");
		System.out.println("The linked list:" + list1);
	}
}
