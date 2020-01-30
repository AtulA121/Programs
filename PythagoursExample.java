//a^2+b^2=c^2
class PythagoursExample {
	public static void main(String args[]){
		int arr[]={3,1,5,6,4};
		outer : for(int i=0;i<=arr.length-2;i++){
			int temp=arr[i]*arr[i];
			for(int j=i+1;j<=arr.length-1;j++){
				int temp2=arr[j]*arr[j];
				int sq1=temp+temp2;
				for(int k=0;k<=arr.length-1;k++){
					int sq2=arr[k]*arr[k];
					if(sq1==sq2){
						System.out.println(temp+" + "+temp2+" = "+sq2);
						break outer;
					}
				}
			}
		}
	}
}