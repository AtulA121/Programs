class SpiralMatirx2xNUsingSingleLoop {
	public static void main(String args[]){
		int arr[][]={
				{0,1,2,3,4,5,6,7,8,9,10},
				{21,20,19,18,17,16,15,14,13,12,11}
			};
		int m=2;
		int n=11;
		int temp2=0;
		boolean temp=false;
		int temp11=0;
		int temp22=0;
		for(int i=0;i<m*n;i++){
			System.out.print(arr[temp11][temp22]+" ");
			if(temp){
				if(temp22==temp11-1){
					break;
				}
				temp22--;
			}
			if(!temp){
				temp22++;
				if(temp22==n){
					temp11++;
					temp22--;
					temp=true;
				}
			}
		}
	}
}