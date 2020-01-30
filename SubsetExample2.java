class SubsetExample2 {
	public static void main(String args[]){
		String str="abc";
		for(int i=0;i<str.length();i++){
			int temp=str.length()-1;
			String subStr="";
			for(int j=i;j<=temp;){
				subStr+=str.charAt(j);
				if(j==temp){
					System.out.print(subStr+" , ");
					temp--;
					j=i;
					subStr="";
				}else{
					j++;
				}
				
				if(temp==i-1){
					break;
				}
			}
		}
	}
}