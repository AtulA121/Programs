class SubArrayWithSumZero {
	static boolean res=false;
	public static void main(String[] args){
		int arr[]={1,1,2,-3,1,6};
		outer : for(int i=0;i<=arr.length-3;i++){
			int sum1=arr[i];
			if(getResult(sum1,i,i)){
				break;
			}
			for(int j=i+1;j<=arr.length-2;j++){
				int sum2=sum1+arr[j];
				if(getResult(sum2,i,j)){
					break outer;
				}
				for(int k=j+1;k<=arr.length-1;k++){
					int sum3=sum2+arr[k];
					if(getResult(sum3,i,k)){
						break outer;
					}
				}
			}
		}
		System.out.println("Array has subarry whoes sum is zero : "+res);
	}
	static boolean getResult(int sum,int i,int j){
		boolean result=false;
		if(sum==0){
			res=true;
			result=true;
		}
		return result;
	}
}