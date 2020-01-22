class findArrayMaxConsecutiveSubset {
	public static void main(String args[]){
		int arr[]={1,2,3,5,12,3,10};
		int temp1=0;
		int x=2;
		int temp2=x+temp1;
		int sum=0;
		int max=0;
		int sIndex=0;
		int eIndex=0;
		for(int i=temp1;i<temp2 && temp2<=arr.length;){
			sum=sum+arr[i];
			i++;
			if(i==temp2){
			if(sum>=max){
				max=sum;
				sIndex=temp1;
				eIndex=i-1;
			}
				sum=sum-arr[temp1];
				temp1++;
				temp2++;
			}
		}
		System.out.println("sIndex : "+sIndex+" , eIndex : "+eIndex+" , max : "+max);
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}
}