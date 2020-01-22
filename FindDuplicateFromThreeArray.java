class FindDuplicateFromThreeArray {
	public static void main(String args[]){
		int a1[]={9,2,3,4,5,6,7,8,1,10,11,10};
		int a2[]={9,2,23,4,3};
		int a3[]={1,2,3,4};
		for(int i=0;i<a1.length;i++){
			boolean t1=false;
			boolean t2=false;
			for(int j=0;j<a2.length;j++){
				if(j<a3.length){
					if(a1[i]==a3[j] && !t1){
						t1=true;
					}
				}
				if(a1[i]==a2[j] && !t2){
					t2=true;
				}
			}
			if(t1 && t2){
				System.out.print(a1[i]+" ");
			}
		}
	}
}