public class LargeSumSubSet {
	public static void main(String args[]){
		
		int arr[]={11,300,11,312313,-1121},max=0,sIndex=0,eIndex=0;
		//using a two loops
		for(int i=0;i<=arr.length-1;i++){
			int sum=0;
			for(int j=i;j<=arr.length-1;j++){
				sum+=arr[j];
				if(sum>=max){
					max=sum;
					sIndex=i;
					eIndex=j;
				}
			}
		}
		System.out.println(sIndex+" , "+eIndex+" , "+max);

		//using a single loop
		int temp11=0;
		int sum=0;
		sIndex=0;eIndex=0;max=0;
		for(int i=0;i<=arr.length-1;i++){
			sum+=arr[i];

			if(sum>=max){
				max=sum;
				sIndex=temp11;
				eIndex=i;
			}
		
			if(i==arr.length-1){
				temp11++;
				i=temp11;
				sum=0;
			}

			if(temp11==arr.length)
				break;
		}
		System.out.println(sIndex+" , "+eIndex+" , "+max);
	}
}