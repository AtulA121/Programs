import java.io.*;

class FindMissingElementExample
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,3,4,6,7,8};
		
		int length=arr.length;
		
		int total=(length+1)*(length+2)/2;
		
		for(int i=0;i<length;i++)
		{
			total-=arr[i];
		}
		
		System.out.println("Missingggggggggggggggggggggggggggggg element :"+total);
		
	//	Other way
		total=0;
		for(int i=1;i<=length+1;i++)
		{
			total=total+i;
		}
		System.out.println("total :"+total);
		
		int miss=0;
		for(int i=0;i<length;i++)
		{
			miss=miss+arr[i];
		}
		System.out.println("Miss :"+miss);
		
		System.out.println("Missingggggggggggggggggggggggggggggg element :"+(total-miss));
		
		
	//	for any given input 
		System.out.println("length :"+length);
		int min=arr[0];
		total=0;
		int miss1=0;
		for(int i=1;i<arr.length-1;i++)
		{
			if(min>arr[i+1])
			{
				min=arr[i+1];
			}
		}
		
		System.out.println("Min :"+min);
		
		System.out.println("length :"+length);
		
		for(int i=min;i<=(length)+min;i++)
		{
			total=total+i;
		}
		System.out.println("total :"+total);
		
		for(int i=0;i<length;i++)
		{
			miss1=miss1+arr[i];
		}
		System.out.println("Miss :"+miss1);
		
		System.out.println("Missingggggggggggggggggggggggggggggg element :"+(total-miss1));
		
		
	}
}