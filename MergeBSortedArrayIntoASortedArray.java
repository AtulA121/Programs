class MergeBSortedArrayIntoASortedArray{
    public static void main(String[] args){
		int arr1[] = {1,2,3,4,5,7,11,12,13,14};
		int arr2[] = {6,8,9,10};
		for(int i=0;i<arr2.length;){
			for(int j=0;j<arr1.length && i<arr2.length;){
				if(arr2[i] > arr1[j]){
					j++;
				}else{
					shiftElements(arr1,j++,arr2[i++]);
				}
			}
		}
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
	}
	static void shiftElements(int[] arr,int location,int ele){
		int hold=arr[location];
		for(int i=location+1;i<=arr.length;i++){
			arr[location]=ele;
			if(i<arr.length){
				ele=hold;
				hold=arr[i];
				location++;
			}
		}
	}
}