class findMaxSumSequence
{
	public static void main(String args[])
	{
		int arr[]=new int[]{500,501,51,60,61,11,12,13,14,15,16,17,18,19,20,200};
		int sIndex=-1;
		int eIndex=-1;
		int maxSum=0;
		for(int i=0;i<=arr.length-1;i++){
			int sum=0;
			int temp=arr.length-1;
			int min=arr[i],max=arr[i];
			for(int j=arr.length-1;j>=i;){
				sum=sum+arr[j];
				if(arr[j] >= max){
					max= arr[j];
				}
				if(arr[j] < min){
					min=arr[j];
				}
				
				if(j==i){
					int sum2=max*(max+1)/2;
					int sum3=(min-1)*min/2;
					int finalSum=sum2-sum3;
					if(finalSum == sum && finalSum > maxSum){
						sIndex=i;
						eIndex=temp;
						maxSum=finalSum;
					}
					temp=temp-1;
					if(temp == i-1){
						break;
					}
					j=temp;
					sum=0;
					max=arr[j];
					min=arr[j];
				}else{
					j--;
				}
			}
		}
		System.out.println("SIndex : "+sIndex+" , eIndex : "+eIndex+" , Sum : "+maxSum);
	}
}