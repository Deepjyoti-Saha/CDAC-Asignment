import java.lang.*;
import java.util.*;

class Pattern11
{
	
	public static void main(String args[])
	{
		
		
		for(int i = 1; i <= 6; i++)
		{
			
			int x = 65;
			for(int j = i; j <= 6; j++)
			{
			
				System.out.print((char)x+" ");
				x++;
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= 6; i++)
		{
			
			int x = 65;
			
			for(int j = 1; j <= i; j++){
				
				System.out.print((char)x+" ");
				x++;
			}
			System.out.println();
		}
	}
}