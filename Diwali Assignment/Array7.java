 
class Array7 {
     
  
    static void arrayMerge(int array1[], int array2[],int n1, int n2, int array3[])
                               
    {
        int i = 0, j = 0, k = 0;
     
        
        while (i < n1 && j < n2)
        {
            array3[k++] = array1[i++];
            array3[k++] = array2[j++];
        }
     
        
        while (i < n1)
            array3[k++] = array1[i++];
     
       
        while (j < n2)
            array3[k++] = array2[j++];
    }
     
   

	
	
public static void main(String args[])
    {
        int array1[] = {23,60,94,3,102};
        int n1 = array1.length;
     
        int array2[] = {42,16,74};
        int n2 = array2.length;
     
        int array3[] = new int[n1+n2];
        arrayMerge(array1, array2, n1, n2, array3);
     
      
        for (int i = 0; i < n1 + n2; i++)
            System.out.print( array3[i] + " ");
    }
	

}