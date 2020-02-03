class FindKthLargestElement{
    public static void main(String[] args){
		int k=3;
		int arr[] = {5,8,12,7,6,2,4};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
			if(i==k-1){
				System.out.println(k+" largest element is : "+arr[i]);
				break;
			}
		}
	}
}