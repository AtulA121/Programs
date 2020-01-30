class IncrementOrDecrementOnNoSelectionOrSelectionInArray {
	public static void main(String args[]){
		int t=0;
		int x=10;
		int count=0;
		int arr[]={10,5,5,4,9};
		for(int i=0;i<arr.length;i++){
			if(arr[i]+t>=x){
				t--;
				count++;
			}else{
				t++;
			}
		}
		System.out.println("count : "+count);
	}
}