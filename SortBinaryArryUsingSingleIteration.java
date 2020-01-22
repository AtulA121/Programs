class SortBinaryArryUsingSingleIteration
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,1,1,0,1,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0};
		int j=arr.length-1;
		for(int i=0;i<j;){
			if(arr[i] == 1 && arr[j] == 0){
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
				i++;
				j--;
			}
			if(arr[i]==0)
				i++;
			if(arr[j]==1)
				j--;
		}
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}
}