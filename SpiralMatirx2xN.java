class SpiralMatirx2xN {
	public static void main(String args[]){
		int arr[][]={
				{1,2,3,4,5,6,7,8,9,10},
				{20,19,18,17,16,15,14,13,12,11}
			};
		int m=2;
		int n=10;
		int temp2=0;
		boolean temp=false;
		for(int i=0;i<m;i++){
			for(int j=temp2;;){
				System.out.print(arr[i][j]+" ");
				if(temp){
					if(j==i-1){
						break;
					}
					j--;
				}
				if(!temp){
					j++;
					if(j==n){
						temp2=j-1;
						temp=true;
						break;
					}
				}
			}
		}
	}
}