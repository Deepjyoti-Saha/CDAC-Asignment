import java.lang.*;
import java.util.*;

class Pattern13
{
	
	public static void main(String args[])
	{
		
		int x = 65;
		for(int i = 1; i < 6; i++)
		{
			
			for(int j = i; j <= 6; j++)
			{
				
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++)
			{
				
				if(j == i || j == 1){
				
					System.out.print((char)x+" ");
				}
				
				else
				{
					
					System.out.print("  ");
				}
				
			}
			x++;
			System.out.println();
		}
		
		int y = 70;
		
		for(int i = 1; i <= 6; i++)
		{
			
			for(int j = 1; j <= i; j++)
			{
				
				System.out.print(" ");
			}
			
			for(int j = i; j <= 6; j++)
			{
				
				if( j == i || j == 6 )
				{
					
					System.out.print((char)y+" ");
				}
				
				else
				{
					
					System.out.print("  ");
				}
			}
			y--;
			System.out.println();
		}
	}
}