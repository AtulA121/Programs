class DegreeClockwise90 {
	public static void main(String[] args){
		int arr[][]={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
			};
		int m=3;
		int n=4;
		for(int i=0;i<n;i++){
			for(int j=m-1;j>=0;j--){
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}