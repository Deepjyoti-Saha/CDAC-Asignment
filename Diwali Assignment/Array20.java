class Array20
{
	public static void seperateZeroNonZero(int arr[])
	{
		int arrZeros[]=new int[arr.length];
		int arrNonZeros[]=new int[arr.length];
		int k=0;
		int l=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arrZeros[k++]=arr[i];
			}
			else 
			{
				arrNonZeros[l++]=arr[i];
			}
		}
		System.out.print("Zero elements :: ");
		for(int i=0;i<k;i++)
		{
			System.out.print(arrZeros[i]+" ");
		}
		System.out.println();
		System.out.print("NonZero elements :: ");
		for(int i=0;i<l;i++)
		{
			System.out.print(arrNonZeros[i]+" ");
		}



	}


	public static void main(String[] args) {
		int arr[]={0,1,0,2,0,3,0,4};
		seperateZeroNonZero(arr);
	}
}
