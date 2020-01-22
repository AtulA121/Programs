

class removeDuplicatePrimeNumber
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,3,3,4,2,5,4,6,3,4,3,3,3,3,7};
		
		int n=arr.length-1;
		int m=n-1;
		int temp=0;
		boolean flag=false;
		
		for(int i=m;i>=0;i--)
		{
			temp=arr[n];
			if(temp==arr[i])
			{
				m--;
				i=m+1;
				n--;
			}
			
			if(i==0)
			{
				System.out.print(" "+arr[n]);
				m--;
				i=m+1;
				n--;
			}
			
			if(n==0)
			{
				if(arr[n]!=0)
				{
					System.out.print(" "+arr[n]);
				}
				break;
			}
		}
	}
}