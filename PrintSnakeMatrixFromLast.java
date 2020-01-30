class PrintSnakeMatrixFromLast {
	public static void main(String args[]){
		int arr[][]={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
			};
		int m=3;
		int n=4;
		boolean temp=false;
		int temp1=n-1;
		int temp2=m-1;
		for(int i=0;i<m*n;i++){
			System.out.print(arr[temp2][temp1]+" ");
			if(!temp){
				if(temp1==0){
					temp=true;
					temp2--;
					continue;
				}
				temp1--;
			}
			if(temp){
				if(temp1==n-1){
					temp=false;
					temp2--;
					continue;
				}
				temp1++;
			}
		}
	}
}