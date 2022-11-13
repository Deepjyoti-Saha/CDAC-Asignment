import java.lang.*;
import java.util.*;

class Pattern4
{
	
	public static void main(String args[])
	{
		
		int n = 1;
		int temp = 5;
		
		for(int i = 0; i < 5; i++)
		{
			
			for(int j = 1; j <=temp; j++)
			{
				
				System.out.print(" ");
			}
			
			n = 1;
			
			for(int j = 0; j <= i; j++)
			{
				
				System.out.print(n+" ");
				n = n *(i-j)/(j+1);
			}
			temp--;
			System.out.println();
			
		}
	}
}