class SmalestNumberInArrayNotPresentINsecondArrayUsingSingleLoop {
	public static void main(String args[]){
		int arr1[]={11,2,3,4,500};
		int arr2[]={10,3,4,5,11,2};
		int min=500;
		int t=0;
		boolean temp=true;
		for(int i=0;i<arr2.length;i++){
			if(arr1[t]==arr2[i]){
				t++;
				i=-1;
				continue;
			}
			if(i==arr2.length-1){
				i=-1;
				if(arr1[t]<=min){
					min=arr1[t];
				}
				t++;
			}
			if(t==arr1.length){
				break;
			}
		}
		System.out.println("min : "+min);
	}
}