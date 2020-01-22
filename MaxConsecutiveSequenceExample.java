class MaxConsecutiveSequenceExample{
    public static void main(String[] args){
		int arr[] = {1,2,3,4,10,11,12,13,14,15};
		int maxCount=0;
		int sIndex=-1;
		int eIndex=-1;
		for(int i=0;i<arr.length;i++){
			int temp=arr.length-1;
			int sum=0;
			int count=0;
			int max=arr[i];
			int min=arr[i];
			for(int j=arr.length-1;j>=i;){
				sum+=arr[j];
				count++;
				if(arr[j]>max){
					max=arr[j];
				}else if(arr[j]<min){
					min=arr[j];
				}
				
				if(j==i){
					int s1=max*(max+1)/2;
					int s2=(min-1)*min/2;
					int s=s1-s2;
					if(s == sum && count > maxCount){
						maxCount=count;
						sIndex=i;
						eIndex=temp;
					}
					if(temp == i){
						break;
					}
					count=0;
					sum=0;
					temp--;
					j=temp;
					max=arr[j];
					min=arr[j];
				}else{
					j--;
				}
			}
		}
		System.out.println("sIndex : "+sIndex+" , eIndex : "+eIndex+" , count : "+maxCount);
	}
}