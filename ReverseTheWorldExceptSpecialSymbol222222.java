
class ReverseTheWorldExceptSpecialSymbol222222 {
	public static void main(String args[]){
		char arr[]=new char[]{'1','b','c','@','d','e','f'};
		int j=arr.length-1;
		for(int i=0;i<j;){
			int first=arr[i];
			int last=arr[j];
			boolean t1=getResult(i);
			boolean t2=getResult(i);
			
			if(t1 && t2){
				first=first+last;
				last=first-last;
				first=first-last;
				arr[i]=(char)first;
				arr[j]=(char)last;
			}
			
			if(t1){
				i++;
			}
			if(t2){
				j--;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	static boolean getResult(int ele){
		return (ele>=48 && ele<=56) || (ele>=65 && ele<=90) || (ele >=97 || ele<=123);
	}
	
}