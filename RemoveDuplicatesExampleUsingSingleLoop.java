class RemoveDuplicatesExampleUsingSingleLoop{
    public static void main(String[] args){
		int arr[] = {15,2,3,4,10,11,11,13,14,15,15,10};
		int temp=0;
		for(int i=temp+1;i<arr.length;i++){
			if(arr[temp] == arr[i] ){
				arr[i]=0;
			}
			if(i==arr.length-1){
				temp++;
				i=temp;
			}
			if(temp==arr.length-1){
				break;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}