class removeDuplicate
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,3,3,4,2,5,4,6,3,4,3,3,3,3};
		
		int n=arr.length-1;
		int m=n-1;
		int temp=0;
		
		for(int i=m;i>=0;i--)
		{
			temp=arr[n];
			if(temp==arr[i])
			{
				arr[i]=0;
			}
			
			if(i==0)
			{
				if(arr[n]!=0)
				{
					System.out.print(" "+arr[n]);
					m--;
					i=m+1;
					n--;
				}
				else
				{
					m--;
					i=m+1;
					n--;
				}
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