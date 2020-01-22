class ReverseString{
	public static void main(String args[]){
		String str="atulpisal";
		System.out.println("reverse : "+reverseString(str));
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(""+str.charAt(i));
		}
	}
	
	static String reverseString(String str1){
		if(str1.isEmpty())
		{
			System.out.println("string is empty : "+str1);
			return str1;
		}
		System.out.println(str1.substring(1)+" : "+str1.charAt(0)+" : "+str1);
		return reverseString(str1.substring(1))+str1.charAt(0);
	}
	
}