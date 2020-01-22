import java.io.*;

class EvenSequenceExample
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,3,4,5,6};
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int m=i;
			int k=i+1;
			sum=arr[i];
			for(int j=i+1;j<n;)
			{
				int no=sum*10+arr[j];
				if(no%2==0)
				{
					System.out.print(" "+no);
					j++;
				}
				else
				{
					j++;
				}
				
				if(j==n)
				{
					m++;
					sum=sum*10+arr[m];
					j=m+1;
				}
				
			}
		}
		
	}
}