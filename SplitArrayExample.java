import java.io.*;

class SplitArrayExample
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int splitSize=((arr.length/2)/2);
		
		int j=splitSize;
		int temp=j;
		
		System.out.println("splitSize :"+splitSize);
		
	/*	for(int i=0;i<arr.length;)
		{
			if(i<temp)
			{
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			//	System.out.print("i :"+i);
			//	System.out.print(" ="+arr[i]+" ");
				i++;
				j++;
			}
			else
			{
			//	System.out.println("\ni :"+i+" j="+j);
				i=j;
				j=j+splitSize;
				temp=j;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	*/
	
		System.out.println("\nNew Style :");
		
		j=splitSize;
		temp=j;
		
		for(int i=0;i<arr.length;)
		{
			if(i<temp)
			{
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			//	System.out.print("i :"+i);
				System.out.print(" "+arr[i]);
				i++;
				j++;
			}
			else if(i<j)
			{
				System.out.print(" "+arr[i]);
				i++;
			}
			else
			{
				j=j+splitSize;
				temp=j;
			}
		}
		
	}
}