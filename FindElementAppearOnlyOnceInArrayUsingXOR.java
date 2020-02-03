class FindElementAppearOnlyOnceInArrayUsingXOR{
    public static void main(String[] args){
		int k=3;
		int arr[] = {1,1,2,2,3,3,4};
		int temp=arr[0];
		for(int i=1;i<arr.length;i++){
			temp=temp^arr[i];
		}
		System.out.println("Element is : "+temp);
	}
}