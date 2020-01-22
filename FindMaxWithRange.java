class FindMaxWithRange {
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6,10};
		int x=3;
		int max=0;
		int sIndex=0;
		int eIndex=0;
		for(int i=0;i<=arr.length-x;i++){
			int sum=0;
			for(int j=i;j<(i+x);j++){
				sum+=arr[j];
			}
			
			if(sum>=max){
				max=sum;
				sIndex=i;
				eIndex=i+2;
			}
			
		}
		System.out.println("sIndex : "+sIndex+" , eIndex : "+eIndex+" , max : "+max);
		
		int aa=-100,bb=20;
		int max2=aa > bb ? aa : bb;
		int min2=aa > bb ? bb : aa;
		System.out.println(max2+" : "+min2);
	}
}