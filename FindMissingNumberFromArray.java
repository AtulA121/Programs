import java.io.*;

class FindMissingNumberFromArray
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,4,5,6,7,3,8};
		int n=arr.length;
		int sum=(n+1)*(n+2)/2;
		for(int i=0;i<arr.length;i++)
		{
			sum-=arr[i];
		}
		
		System.out.println(""+sum);
		
		int sum1=(n+1)*(n+2)/2;
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			temp+=arr[i];
		}
		
		System.out.println(""+(sum1-temp));
	}
}