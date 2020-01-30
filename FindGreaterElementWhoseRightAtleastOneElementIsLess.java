class FindGreaterElementWhoseRightAtleastOneElementIsLess {
	public static void main(String args[]){
		int arr[]={16,15,15,12,100,100};
		int min=arr[arr.length-1];
		int count=0;
		for(int i=arr.length-2;i>=0;i--){
			min=arr[i] < min ? arr[i] : min;
			if(arr[i]>min){
				count++;
			}
		}
		System.out.println("count : "+count);
	}
}