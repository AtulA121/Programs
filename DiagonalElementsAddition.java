class DiagonalElementsAddition {
	public static void main(String args[]){
		int arr[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		int m=3;
		int n=3;
		int sum1=0;
		int sum2=0;
		int ignore=0;
		int temp2=n-1;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(i==j){
					sum1+=arr[i][j];
					sum2+=arr[i][temp2--];
				}
			}
		}
		if(n%2!=0){
			ignore=arr[m%2][n%2];
		}
		System.out.print((sum1+sum2)-ignore);
	}
}