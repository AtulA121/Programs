class MergeTwoArrayIntoThirdArray{
    public static void main(String[] args){
		int arr1[]={1,2,3};
		int arr2[]={11,32,3,10,1,2,3};
		int arr3[]=new int[arr1.length+arr2.length];
		int number=0;
		for(int i=0;i<arr3.length;i++){
			if(i<=arr1.length-1){
				arr3[i]=arr1[i];
			}else{
				arr3[i]=arr2[number];
				number++;
			}
		}
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
	}
}