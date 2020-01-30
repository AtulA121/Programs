class SubsetExample {
	public static void main(String args[]){
		String str="abc";
		for(int i=0;i<str.length();i++){
			int temp=str.length()-1;
			String subStr="";
			for(int j=temp;j>=i;){
				subStr+=str.charAt(j);
				if(j==i){
					System.out.print(subStr+" , ");
					temp--;
					j=temp;
					subStr="";
				}else{
					j--;
				}
				if(temp==i-1){
					break;
				}
			}
		}
	}
}