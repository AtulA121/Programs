
class MergeTwoArryIntoThirdByDescendingArray {
	public static void main(String args[]){
		int arr1[]={1,2,4,6};
		int arr2[]={3,5,11,12};
		int arr3[]=new int[arr1.length+arr2.length];
		int t1=arr1.length-1;
		int t2=arr2.length-1;
		for(int i=0;i<arr3.length;){
			if(t1>=0 && t2>=0){
				if(arr1[t1]>arr2[t2]){
					arr3[i++]=arr1[t1--];
					continue;
				}
				arr3[i++]=arr2[t2--];
			}else if(t1>=0){
				arr3[i++]=arr1[t1--];
				continue;
			}else{
				arr3[i++]=arr2[t2--];
			}
		}
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
	}
}