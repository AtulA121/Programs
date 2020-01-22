public class TripletsExample {
	public static void main(String args[]){
		int arr[]={2,3,4,5,11},sIndex=0,mIndex=0,lIndex=0,x=15,glo=x,max=0;
		int temp1=0;
		boolean bool=false;
		int temp2=temp1+1;

		for(int i=temp1;i<=arr.length-3;i++){
			int sum=arr[temp1]+arr[temp2];

			for(int j=(temp2+1);j<=arr.length-1;j++){
				int temp3=sum+arr[j];
				int close=x-temp3;

				if(close<0)
					close=-close;

				if(close==0){
					max=temp3;
					sIndex=temp1;
					mIndex=temp2;
					lIndex=j;
					glo=close;
					bool=true;
					break;
				}

				if(close<glo){
					max=temp3;
					sIndex=temp1;
					mIndex=temp2;
					lIndex=j;
					glo=close;
				}
			}

			if(bool)
				break;

			temp2++;

			if(temp1==arr.length-3){
				break;
			}

			if(temp2==arr.length-1){
				temp1++;
				i=temp1;
				i--;
				temp2=temp1+1;
			}
		}
		System.out.println("sIndex : "+sIndex+" = "+arr[sIndex]+" , mIndex : "+mIndex+" = "+arr[mIndex]+" , lIndex : "+lIndex+" = "+arr[lIndex]+" , max : "+max);
	}
}