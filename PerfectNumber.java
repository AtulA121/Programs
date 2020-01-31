class PerfectNumber {
	public static void main(String[] args){
		int n=28;
		int sum=1;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		if(sum==n){
			System.out.println(n+" Number is perfect number . ");
		}else{
			System.out.println(n+" is not a perfect number . ");
		}
	}
}