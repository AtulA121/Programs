
class PrintPatternExample2
{
	public static void main(String args[])
	{
		int n=5;
		int temp=1;
		for(int i=1;i<=n;)
		{
			if(i<=temp)
			{
				System.out.print("* ");
				i++;
			}
			else
			{
				i=1;
				temp++;
				System.out.println("");
			}
			
		}
		
		
		
		
	System.out.println("");
	int j = 1; // Line count 
  
    int k = 0; 
    for (j = 1; j <= n; ) 
    { 
        // If current star count is less than 
        // current line number 
        if (k < j) 
        { 
           System.out.print("* ");
           k++; 
           continue; 
        } 
		else
		{
			System.out.println("");
		}
        if (k == j) 
        { 
           j++; 
           k = 0; 
        } 
    } 
	}
}