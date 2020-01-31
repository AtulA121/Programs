class DecimalToBinary {
	static String str="";
	public static void main(String[] args){
		int n=4;
		System.out.println("Binary of "+n+" is : "+getValue(n));
	}
	static String getValue(int n){
		if(n>0){
			int rem=n%2;
			str+=getValue(n/2)+rem;
		}
		return str;
	}
}