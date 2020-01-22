class FindMinFromFirstArray {
	public static void main(String args[]){
		int arr1[]={10,-200,-12,4,5,2};
		int arr2[]={15,2,4,5,2,10,20,30};
		int min=0;
		int temp=0;
		for(int i=0;i<=arr1.length-1;i++){
			boolean bool=false;
			for(int j=0;j<=arr2.length-1;j++){
				if(arr1[i]==arr2[j]){
					bool=false;
					break;
				}else{
					bool=true;
				}
			}
			
			if(bool){
				if(temp==0)
					min=arr1[i];
				temp++;
				if(arr1[i]<min){
					min=arr1[i];
				}
			}
		}
		System.out.println("min is : "+min);
	}
}