class MaximumConsecutiveProductSubArray{
    public static void main(String[] args){
		int arr[] = {4,-2,-3,4,-1,-2,1,5,-3,100};
		int max=0;
		int start=0;
		int maxTill=1;
		int sIndex=0,eIndex=0;;
		for(int i=0;i<arr.length;i++){
			maxTill*=arr[i];
			if(max<maxTill){
				max=maxTill;
				sIndex=start;
				eIndex=i;
			}
			if(maxTill<0){
				maxTill=1;
				start=i+1;
			}
		}
		System.out.println("sIndex : "+sIndex+" , eIndex : "+eIndex+" , sum : "+max);
	}
}