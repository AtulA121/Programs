class SmalestNumberInArrayNotPresentINsecondArray {
	public static void main(String args[]){
		int arr1[]={11,2,3,4,500};
		int arr2[]={10,3,4,5,11,2};
		int min=500;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					break;
				}
				if(j==arr2.length-1 && arr1[i]<=min){
					min=arr1[i];
				}
			}
		}
		System.out.println("min : "+min);
	}
}