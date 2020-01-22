class findArrayMaxSumConsecutivePairSubset {
	public static void main(String args[]){
		int arr[]={1,2,3,5,12,3,10,12};
		int maxSum=0;
		int sIndex=-1;
		int eIndex=-1;
		for(int i=0;i<arr.length-1;i++){
			int sum=arr[i]+arr[i+1];
			if(sum > maxSum){
				maxSum=sum;
				sIndex=i;
				eIndex=i+1;
			}
		}
		System.out.println("sIndex : "+sIndex+" , eIndex : "+eIndex+" , sum : "+maxSum);
	}
}