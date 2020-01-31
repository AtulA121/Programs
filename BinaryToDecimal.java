class BinaryToDecimal {
	public static void main(String[] args){
		int n=10101,x=n;
		int sum=0;
		int count=0;
		while(n>0){
			int rem=n%10;
			sum+=rem*(Math.pow(2,count));
			count++;
			n=n/10;
		}
		System.out.println("Decimal of "+x+" is : "+sum);
	}
}