class PrintZigzakUsingSingleLoop {
	public static void main(String args[]){
		int arr[][]={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
			};
		int m=3;
		int n=4;
		int temp2=0;
		int level=0;
		boolean temp1=true;
		for(int i=0;i<m*n;i++){
			System.out.print(arr[level][temp2]+" ");
			if(temp1){
				if(temp2 == n-1){
					temp1=false;
					level++;
					continue;
				}else{
					temp2++;
				}
			}
			if(!temp1){
				if(temp2 == 0){
					temp1=true;
					level++;
				}else{
					temp2--;
				}
			}
		}
	}
}