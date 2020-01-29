class PrintZigzak {
	public static void main(String args[]){
		int arr[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		int m=3;
		int n=3;
		int temp2=0;
		boolean temp1=true;
		for(int i=0;i<m;i++){
			for(int j=temp2;;){
				System.out.print(arr[i][j]+" ");
				if(temp1){
					j++;
					if(j==n){
						temp2=n-1;
						temp1=false;
						break;
					}
				}
				if(!temp1){
					j--;
					if(j==-1){
						temp2=0;
						temp1=true;
						break;
					}
				}
			}
		}
	}
}