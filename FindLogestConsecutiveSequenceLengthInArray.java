class FindLogestConsecutiveSequenceLengthInArray{
    public static void main(String[] args){
		int arr[] = {3,9,1,10,4,20,2,5,6,11,12,13,14,15,16,17,100,18};
		int maxCount=0;
		for(int i=0;i<arr.length;i++){
			int temp=arr[i]-1;
			for(int j=0;j<arr.length;j++){
				if(arr[j]==temp){
					break;
				}
			}
			int count=1;
			int temp1=arr[i]+1;
			for(int j=0;j<arr.length;j++){
				if(arr[j]==temp1){
					count++;
					temp1++;
					j=-1;
				}
			}
			if(count>maxCount){
				maxCount=count;
			}
		}
		System.out.println("MaxConsecutiveLongestSequenceLength is : "+maxCount);
	}
}