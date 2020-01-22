class MergeIntoThirdArray{
	public static void main(String args[]){
		int arr1[]={1,2,3,4,5};
		int arr2[]={2,3,4,5,6,7};
		int arr3[]=new int[arr1.length+arr2.length];
		int t1=arr1.length-1;
		int t2=arr2.length-1;
		
		for(int i=0;i<=arr3.length-1;i++){
			
			if(t1>=0 && t2>=0){
				if(arr1[t1]>arr2[t2]){
					arr3[i]=arr1[t1];
					t1--;
				}else{
					arr3[i]=arr2[t2];
					t2--;
				}
			}else if(t1>=0){
				arr3[i]=arr1[t1];
				t1--;
			}else{
				arr3[i]=arr2[t2];
				t2--;
			}
		}
		
		for(int i=0;i<=arr3.length-1;i++){
			System.out.print(arr3[i]+" ");
		}
	}
 }