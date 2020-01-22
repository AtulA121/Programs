public class TripletsExample2 {
	static int arr[]={2,3,4,5,11},sIndex=0,mIndex=-1,eIndex=-1,n=15,maxSum=0;
	static int close=0;
	public static void main(String args[]){
		outer : for(int i=0;i<arr.length-2;i++){
			int sum=arr[i];
			int temp=i+1;
			for(int j=temp+1;i<arr.length;j++){
				sum=arr[temp]+arr[j];
				if(sum == n){
					addIndex(i,temp,j,sum,0);
					break outer;
				}
				int max= n>sum ? n : sum;
				int min= n>sum ? sum : n;
				int newClose=max-min;
				if(newClose<close){
					addIndex(i,temp,j,sum,newClose);
				}
				if(j==arr.length-1){
					temp++;
					j=temp+1;
				}
				if(temp==arr.length-1){
					break;
				}
			}
		}
		System.out.println("sIndex : "+sIndex+" = "+arr[sIndex]+" , mIndex : "+mIndex+" = "+arr[mIndex]+" , eIndex : "+eIndex+" = "+arr[eIndex]+" , max : "+maxSum);
	}
	private static void addIndex(int i,int temp,int j,int sum,int newClose){
		close=newClose;
		sIndex=i;
		eIndex=j;
		mIndex=temp;
		maxSum=sum;
	}
}