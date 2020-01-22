class IntersectionExample{
    public static void main(String[] args){ 
        int arr1[] = {211,421,25,11,521,161};
		int arr2[] = {211,31,421,25,11,521,161,0};
		
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr2[i]==arr1[j]){
					break;
				}
				if(j==arr1.length-1){
					System.out.print(arr2[i]+" ");
				}
			}
		}
	}
}