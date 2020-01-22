class FindSubsetArray2 {
	public static void main(String args[]){
		int arr[]={1,2,3,4};
		int temp1=0;
		int temp2=temp1+1;
		for(int i=temp1;i<=arr.length-1;){
			System.out.print("\n{"+(arr[temp1])+"}="+arr[i]);
			int sum=arr[temp1];
			for(int j=temp2;j<=arr.length-1;j++){
				sum=sum+arr[j];
				System.out.print(" , {"+(arr[temp1])+","+(arr[temp2])+"}="+sum);
				for(int k=j+1;k<=arr.length-1;k++){
					int temp3=sum+arr[k];
					System.out.print(" , {"+(arr[temp1])+","+(arr[temp2])+","+(arr[k])+"}="+temp3);
				}
			}
			temp2++;
			if(temp2==arr.length){
				temp1++;
				i=temp1;
				temp2=temp1+1;
			}
			else{
				i++;
			}
			
			if(temp1==arr.length)
				break;
		}
		
	}
}