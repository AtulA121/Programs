class FindDuplicatesFromSortedArray {
	public static void main(String args[]){
		int arr1[]={2,3,4,5,11};
		int arr2[]={2,3,4,5,11};
		int arr3[]={2,3,4,5,11};
		int x=0,y=0,z=0;
		while(x<arr1.length && y<arr2.length && z<arr3.length){
			if(arr1[x]==arr2[y] && arr1[x]==arr3[z]){
				System.out.print(arr1[x]+" ");
				x++;
				y++;
				z++;
			}else if(arr1[x]<arr2[y]){
				x++;
			}else if(arr2[y]<arr3[z]){
				y++;
			}else{
				z++;
			}
		}
	}
}