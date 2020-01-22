class InterleavingTwoArrayIntoThirdArray {
	public static void main(String args[]){
		int arr1[]={1,2,4,6};
		int arr2[]={3,5,11,12};
		int t1=0;
		int t2=1;
		int arr3[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr3.length;){
			if(i%2==0 && t1<=arr1.length-1){
				arr3[i++]=arr1[t1];
				t1=t1+2;
			}else if(t2<=arr2.length-1){
				arr3[i++]=arr2[t2];
				t2=t2+2;
			}else{
				i++;
			}
		}
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
	}
}