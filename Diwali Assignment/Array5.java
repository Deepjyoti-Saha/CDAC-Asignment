import java.util.*;
class Array5
{
	public static void findSmallestLargest(int arr[])
	{
		int largest,smallest;
		largest=smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}

		}

		System.out.println("Largest number is : "+largest);
		System.out.println("Smallest number is : "+smallest);
	}
public static void main(String[] args)
{
	int arr[] = {10,20,30,40,50,60,70,80,90};

	findSmallestLargest(arr);
}
}