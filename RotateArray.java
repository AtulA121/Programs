class RotateArray{
    public static void main(String[] args){
		int arr[] = {-2,1,-3,4,-1,-2,-1,-5,41};
		int temp=0;
		int n=5;
		while(temp<arr.length){
			System.out.print(arr[n++]+" ");
			if(n==arr.length){
				n=0;
			}
			temp++;
		}
	}
}