	import java.io.*;


	class CombinationOfArrayExample
	{
		public static void main(String args[])
		{
			int arr[]=new int[]{1,2,3,4,5};
			int temp=0;
				
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					temp=arr[i]*10+arr[j];
					System.out.print("  "+temp);
					for(int k=j+1;k<arr.length;k++)
					{
						temp=temp*10+arr[k];
						System.out.print("  "+temp);
					}
				}
			}
		}
	}