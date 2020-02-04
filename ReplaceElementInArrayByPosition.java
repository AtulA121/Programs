class ReplaceElementInArrayByPosition {
	public static void main(String args[]){
		int arr1[]={2,3,4,5,11};
		int k=4;
		int n=20;
		// first way
		for(int i=arr1.length-1;i>=k;i--){
			if(i==k){
				arr1[i]=n;
			}else{
				arr1[i]=arr1[i-1];
			}
		}
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println(" ");
		// second way
		int hold=200;
		for(int i=k;i<=arr1.length-1;i++){
			arr1[i]=hold;
			if(i==arr1.length-1){
				break;
			}
			hold=arr1[i+1];
		}
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
	}
}