import java.io.*;

class FindSecondHighestNumber
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,3,4,45,58,4,67,5,4,4,34,55};
		int max1=arr[0];
		int max2=0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				if(max1>max2)
				{
					max2=max1;
				}
				max1=arr[i];
			}
			else if(arr[i]>max2)
			{
				max2=arr[i];
			}
		}
		
		System.out.println(""+max2);
	}
}