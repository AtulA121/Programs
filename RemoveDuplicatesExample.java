class RemoveDuplicatesExample{
    public static void main(String[] args){
		int arr[] = {15,2,3,4,10,11,12,13,14,15,15};
		for(int i=0;i<arr.length;i++){
			if(arr[i]<1){
				break;
			}
			for(int j=arr.length-1;j>=0;j--){
				if(i==j){
					break;
				}
				if(arr[i]==arr[j]){
					arr[j]=0;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}