class DeleteElementInArray {
	public static void main(String args[]){
		int arr[]={20,3,4,5,11};
		int n=11;
		boolean temp=true;
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]==n && temp){
				temp=false;
			}
			if(!temp && i+1<arr.length){
				arr[i]=arr[i+1];
			}
		}
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}
}