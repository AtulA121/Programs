class findSubsetExample
{
	public static void main(String args[])
	{
		int arr[]={1,2,-3,4,5};
		int max=0,sIndex=0,eIndex=0;
		int temp1=0;
		int temp2=temp1+1;
		for(int i=temp1;i<=arr.length-1;){
			int sum=arr[temp1];
			System.out.print("--- : "+sum+" ");
			for(int j=temp2;j<=arr.length-1;j++){
				sum=sum+arr[j];
				System.out.print(sum+" ");
				
				for(int k=j+1;k<=arr.length-1;k++){
					int temp=sum+arr[k];
					System.out.print(temp+" ");
					if(temp>max){
						sIndex=temp1;
						eIndex=k;
						max=temp;
					}
				}
				System.out.println("");
				
				if(temp2==arr.length-1)
					break;
				
				if(j==arr.length-1){
					sum=arr[temp1];
					temp2++;
					j=temp2;
					j=j-1;
				}
			}
			temp1++;
			i=temp1;
			temp2=temp1+1;
			
			if(temp1==arr.length)
				break;
		}
		System.out.println("\n\n"+sIndex+"-"+arr[sIndex]+" , "+eIndex+"-"+arr[eIndex]+" = "+max);
	}
}