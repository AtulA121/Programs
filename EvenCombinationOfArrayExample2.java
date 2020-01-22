
	class EvenCombinationOfArrayExample2
	{
		public static void main(String args[])
		{
			int arr[]=new int[]{1,2,3,4,5,6};
			int temp=0;
				
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					temp=arr[i]*10+arr[j];
					if(temp%2==0)
					{
						System.out.print(" "+temp);
					}
				//	System.out.print("  "+temp);
					for(int k=j+1;k<arr.length;k++)
					{
						temp=temp*10+arr[k];
						if(temp%2==0)
						{
							System.out.print(" "+temp);
						}
					//	System.out.print("  "+temp);
					}
				}
			}
		}
	}