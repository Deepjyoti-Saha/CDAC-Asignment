import java.util.Scanner;

class Array15
{
	public static void main(String[] args)
	{
		int arr[]=new int[100];
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			 arr[i]= sc.nextInt();

		}
		int m = n-1;
		int sumDesired = (arr[m]*(arr[m]+1))/2;
		
		int sumObtained = 0;
		for(int i=0;i<n;i++)
		{
			sumObtained = sumObtained + arr[i];
			
		}
		
		int missingNum = sumDesired - sumObtained;
		System.out.println(missingNum);

	}

}