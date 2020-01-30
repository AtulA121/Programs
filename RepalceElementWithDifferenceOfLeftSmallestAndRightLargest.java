class RepalceElementWithDifferenceOfLeftSmallestAndRightLargest {
	public static void main(String args[]){
		int arr[]={1,5,2,4,3};
		int arr2[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int s=getSmallest(arr,i-1);
			int l=getLargest(arr,i+1);
			int small=s < l ? s : l;
			int large=s > l ? s : l;
			arr2[i]=large-small;
		}
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
	}
	static int getSmallest(int[] arr,int n){
		int small = n<0 ? 0 : arr[0];
		for(int i=0;i<=n;i++){
			if(arr[i]<small){
				small=arr[i];
			}
		}
		return small;
	}
	static int getLargest(int[] arr,int n){
		int large = n>=arr.length ? 0 : arr[arr.length-1];
		for(int i=n;i<arr.length;i++){
			if(arr[i]>large){
				large=arr[i];
			}
		}
		return large;
	}
}