
class PrintMatrix{
	public static void main(String args[]){
		int n=10,temp1=1,temp2=n*2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				
				if(i%2==0){
					System.out.print(temp2+" ");
					temp2++;
				}
				else{
					System.out.print(temp1+" ");
					temp1++;
				}
			}
			System.out.println("");
		}
		
	}
}