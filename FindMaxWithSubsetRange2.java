class FindMaxWithSubsetRange2 {
	public static void main(String args[]){
		int arr[]={11,2,3,4,55,16,1};
		int x=3;
		int max=0;
		int sIndex=0;
		int eIndex=0;
		int temp1=0;
		int temp2=temp1+1;
		for(int i=temp1;i<=arr.length-x+1;i++){
			int sum=0;
			int sum3=arr[temp1];
			for(int j=temp2;j<=i+x-1;j++){
				sum3=sum3+arr[j];
				System.out.println(""+sum3);
			}
			System.out.println("---------- : "+sum3);
		}
		System.out.println("sIndex : "+sIndex+" , eIndex : "+eIndex+" , max : "+max);
	}
}