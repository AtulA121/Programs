class ReverseArrayInPlace{
    public static void main(String[] args){
		int arr[] = {-2,1,-3,4,-1,-2,-1,-5,41};
		int temp=arr.length-1;
		for(int i=0;i<temp;i++,temp--){
			arr[i]=arr[i]+arr[temp];
			arr[temp]=arr[i]-arr[temp];
			arr[i]=arr[i]-arr[temp];
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}