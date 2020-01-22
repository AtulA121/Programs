class RemoveDuplicatesExampleUsingSingleLoopOrderedCollection{
    public static void main(String[] args){
		int arr[] = {1,1,2,2,3,3,4,4,9,10};
		int temp=1;
		for(int i=0;temp<=arr.length-1;){
			if(arr[i] == arr[temp]){
				arr[temp]=0;
				temp++;
			}else{
				i=temp;
				temp++;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}