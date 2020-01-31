class DecimalToBinary2 {
	public static void main(String[] args){
		int n=255,x=n;
		String str="";
		while(n>0){
			int rem=n%2;
			str=rem+str;
			n=n/2;
		}
		System.out.println("Binary of "+x+" is : "+str);
	}
}