class DeleteDuplicateElementInSortedArray2 {
	public static void main(String args[]){
		int arr1[]={1,1,2,2,3,3,4,4,5,6};
		int temp=0;
		for(int i=0;i<arr1.length-1;i++){
			if(arr1[i]!=arr1[i+1]){
				arr1[temp++]=arr1[i];
			}
		}
		arr1[temp++]=arr1[arr1.length-1];
		for(int i=0;i<temp;i++){
			System.out.print(arr1[i]+" ");
		}
	}
}