class findSequenceExample
{
	public static void main(String args[])
	{
		int arr[]=new int[]{3,1,10,31,32,34,99,98,100,155,156,200};
		int len=arr.length;
		int count=0;
		int first=-1;
		int last=-1;
		
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(""+arr[i]);
			if((arr[i+1]>=arr[i]-len && arr[i+1]<=arr[i]) || (arr[i+1]<=arr[i]+len && arr[i+1]>=arr[i]))
			{
				if(count==0)
				{
					count++;
					first=i;
				}
			}
			else
			{
				System.out.println(""+arr[i]+" "+arr[i+1]);
				if(count!=0)
				{
					last=i;
					System.out.println(""+first+" = "+arr[first]+" , "+last+" = "+arr[last]);
				}
				count=0;
			}
		}
	}
}