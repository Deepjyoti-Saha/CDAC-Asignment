import java.lang.*;
import java.util.*;

class Pattern12
{
	
	public static void main(String args[])
	{
		
		for(int i = 1; i<= 6; i++)
		{
			
			for(int j = i; j <= 6; j++)
			{
				
				System.out.print(" ");
			}
			
			int x = 65;
			
			for(int j = 1; j <= i; j++)
			{
				
				System.out.print((char)x+" ");
				x++;
			}
			
			System.out.println();
		}
	}
}