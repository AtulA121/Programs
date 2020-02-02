class FindLogestConsecutiveSequenceLengthInArray2{
    public static void main(String[] args){
		int maxCount=0;
		int arr[] = {3,9,1,10,4,20,2,5,6,11,12,13,14,15,16,17,100,18};
		for(int i=0;i<arr.length;i++){
			int temp=arr[i]-1;
			for(int j=0;j<arr.length;j++){
				if(arr[j]==temp){
					break;
				}
			}
			int temp1=arr[i]+1;
			for(int j=0;j<arr.length;j++){
				if(arr[j]==temp1){
					temp1++;
					j=-1;
				}
			}
			if(temp1-arr[i] > maxCount){
				maxCount=temp1-arr[i];
			}
		}
		System.out.println("MaxConsecutiveLongestSequenceLength is : "+maxCount);
	}
}