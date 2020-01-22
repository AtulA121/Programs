class FindMaxWithSubsetRange {
	public static void main(String args[]){
		int arr[]={11,2,3,4,55,16,1};
		int x=4;
		int max=0;
		int sIndex=0;
		int eIndex=0;
		int temp1=0;
		int temp2=temp1+1;
		
		for(int i=temp1;i<=arr.length-x+1;){
			int sum=arr[temp1]+arr[temp2];
			int count=2;
			int temp111=sum;
			for(int j=temp2+1;j<=arr.length-1;j++){
				temp111+=arr[j];
				count++;
				if(count==x){
					System.out.println("------------------- sum is : "+temp111);
					if(temp111>=max){
						max=temp111;
						sIndex=temp1;
						eIndex=j;
					}
					temp111=sum;
					count=2;
				}
			}
			temp2++;
			
			if(temp1==arr.length-x){
				
				break;
			}
			
			if(temp2==(arr.length-x+2)){
				temp1++;
				System.out.println("changed : "+temp1);
				i=temp1;
				temp2=temp1+1;
			}else{
				i++;
			}
			
		}
		System.out.println("sIndex : "+sIndex+" , eIndex : "+eIndex+" , max : "+max);
	}
}