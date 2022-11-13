public class SpecialString1 {
  public static void main(String Args[]) {
    String s = "Technology is the new oil";
    //Declaring an array of strings to store the result after splitting the string
    String[] sArray1;
	String[] sArray2;
    
	System.out.println("The given String is\n "+s);
    
	//splitting the string based on whitespace
    sArray1 = s.split("\\s");
    //printing the result
    System.out.println("Result after splitting:");
    for(int i=0; i<sArray1.length; i++) 
	{
      System.out.println(sArray1[i]);
	  
    }
	
	
	for(int i=0; i<sArray1.length;i++)
	{
		for(int j=i; j<sArray1.length-1;j++)
		{
			if(sArray1[j].length() >sArray1[j+1].length())
			{
				String temp;
				temp = sArray1[j];
				sArray1[j] = sArray1[j+1];
				sArray1[j+1]= temp;
				
			}
		}
	}
	
	System.out.println("Result after sorting:");
    for(int i=0; i<sArray1.length; i++) 
	{
      System.out.println(sArray1[i]);
	  
    }
	
  }
}