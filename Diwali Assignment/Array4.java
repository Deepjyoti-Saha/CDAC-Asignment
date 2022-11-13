import java.util.*;
class Array4
{

	public static void main(String[] args)
	{
		int array1[] = {10,20,30,40,50,60};
		int n = array1.length;
		int array2[] = new int[n];
		
		for(int i =0; i<n; i++)
		{
			
			array2[i] = array1[n-1-i];
		}
		
		for(int i =0; i<n; i++)
		{
			System.out.println(array2[i]+" ");
		}
	}

}