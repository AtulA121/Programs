class SubArrayWithMaximumSum{
    public static void main(String[] args){
		int arr[] = {-2,1,-3,4,-1,-2,-1,-5,41};
		int maxSum=arr[0];
		int sIndex=-1;
		int eIndex=-1;
		for(int i=0;i<arr.length;i++){
			int temp=arr.length-1;
			int sum=0;
			for(int j=temp;j>=i;j--){
				sum=sum+arr[j];
				if(j==i){
					if(sum>maxSum){
						sIndex=i;
						eIndex=temp;
						maxSum=sum;
					}
					temp--;
					j=temp+1;
					sum=0;
				}
				if(temp==i-1){
					break;
				}
			}
		}
		System.out.println("sIndex : "+sIndex+" , eIndex : "+eIndex+" , MaxSum : "+maxSum);
	}
}