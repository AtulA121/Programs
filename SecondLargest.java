class SecondLargest {
	public static void main(String[] args){
		int arr[]={11,2,3,4,5,11};
		int max1=arr[0] > arr[1] ? arr[0] : arr[1];
		int max2=arr[0] < arr[1] ? arr[0] : arr[1];
		for(int i=2;i<arr.length;i++){
			if(arr[i]>max1){
				max2=max1;
				max1=arr[i];
			}else if(arr[i]>max2){
				max2=arr[i];
			}
		}
		System.out.println("max1 : "+max1+" , max2 : "+max2);
	}
}