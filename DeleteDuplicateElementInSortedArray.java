class DeleteDuplicateElementInSortedArray {
	public static void main(String args[]){
		int arr1[]={1,1,2,2,3,3,4,4,5,6};
		int arr2[]=new int[arr1.length];
		int temp=0;
		for(int i=0;i<arr1.length-1;i++){
			if(arr1[i]!=arr1[i+1]){
				arr2[temp++]=arr1[i];
			}
		}
		arr2[temp]=arr1[arr1.length-1];
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
	}
}