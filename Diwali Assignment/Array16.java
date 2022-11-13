class Array16
{
	public static void findIntersection(int arr1[],int arr2[])
	{
		
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr2.length;j++)
				{
					if(arr1[i]==arr2[j])
					{
						System.out.print(arr1[i]+" ");

					}


				}
			}


		



	}

	public static void main(String[] args) {
		int arr1[]={10,20,30,40,50};
		int arr2[]={5,10,15,20,25,30,35,40};
		findIntersection(arr1,arr2);
	}
}