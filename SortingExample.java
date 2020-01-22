import java.io.*;

class SortingExample
{
	public static void main(String args[])
	{
	//	int arr[]=new int[]{1,2,3,6,7,4,3,2,8,9,2};
	//	int arr[]=new int[]{21,12,13,16,17,14,13,12,18,19,22};
		int arr[]=new int[]{31,22,23,16,17,14,13,22,28,9,2};
		int len=(arr.length)-1;
		int j=0;
		for(int i=0;i<len;i++)
		{
			if(arr[i]>arr[i+1])
			{
				arr[i]=arr[i]+arr[i+1];
				arr[i+1]=arr[i]-arr[i+1];
				arr[i]=arr[i]-arr[i+1];
			}
			if(i==len-1)
			{
				len--;
				i=-1;
			}
			
		}
		System.out.println("Sorting array is :");
		for(int i : arr)
		{
			System.out.print(" "+i);
		}
	}
}