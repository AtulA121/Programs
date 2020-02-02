class AppearenceNKTimes{
    public static void main(String[] args){
		int arr[] = {-2,-1,-3,4,-1,-2,-1,-2};
		int k=arr.length/4;
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count>k){
				System.out.println(arr[i]+" is repeated "+count+" times.");
			}
		}
	}
}