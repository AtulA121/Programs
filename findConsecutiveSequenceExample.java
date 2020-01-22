import java.io.*;

class findConsecutiveSequenceExample
{
	public static void main(String args[])
	{
		int arr[]=new int[]{91,93,92,1,2,3,4,5,6,7,8,9};
	//	int arr[]=new int[]{12,11,94,95,96,97,11,12,13,31,32,33,34,35,37,36,39,38,41,40,42,14,15,16,17,18,19,20,100};
		int allCount=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			int count=0;
		
		//	int len=arr.length-1;
			int len2=arr.length-1;
			int max=arr[len2];
			int min=arr[i];
			
			for(int j=len2;j>=i;)
			{
				sum=sum+arr[j];
				count++;
				if(arr[j]>max)
					max=arr[j];
				if(arr[j]<min)
					min=arr[j];
				if(i==j)
				{
					int startToEnd=(max*(max+1))/2;
					int startToPrevious=(min*(min-1))/2;
					int allSum=startToEnd-startToPrevious;
					
					if(allSum==sum)
					{
						if(count>allCount)
						{
							allCount=count;
						}
						break;
					}
					len2--;
					j=len2;
					max=arr[j];
					min=arr[j];
					sum=0;
					count=0;
				}
				else
					j--;
				if(len2==i)
					break;
			}
		}
		System.out.println("Maximum Consecutive Sequence count is : "+allCount);
	}
}