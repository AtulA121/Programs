class MettingManagementExample {
	public static void main(String args[]){
		int arr1[]={1,3,0,5,8,5,0};
		int arr2[]={2,4,1,7,9,9,1};
		int endTime=0;
		int count=0;
		int startTime=arr1[0];
		for(int i=0;i<arr1.length;i++){
			if(arr1[i] >= endTime){
				count++;
				endTime=arr2[i];
				startTime=arr1[i] <= startTime ? arr1[i] : startTime;
			}else if(arr1[i] < startTime && arr2[i] <=startTime){
				count++;
				startTime=arr1[i] <= startTime ? arr1[i] : startTime;
			}
		}
		System.out.println("Number of metting in a day is : "+count);
	}
}