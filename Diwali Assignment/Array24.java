import java.util.*;



class Array24{
	static void bsort(int a1[])
	{
	int n =a1.length;
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(a1[j] > a1[j+1])
			{
				
				int temp = a1[j];
				a1[j]=a1[j+1];
				a1[j+1]=temp;
				
			}
			
				
				
		
		}
		
	}
	System.out.print("The 2nd largest element is " + a1[n-2]);
	}
	
		
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number of elements you want to store: ");  
		 int n = sc.nextInt();
		 
		 int[] a1 = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<n; i++)  
			{  
			a1[i]=sc.nextInt();  
			}  
			bsort(a1);
		
		
		
	}
}
