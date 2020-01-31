class FillWith1sRespectedRowAndColumn {
	public static void main(String[] args){
		int arr[][]={
				{1,1,0},
				{0,0,1},
				{0,0,1}
			};
		int m=3;
		int n=3;
		int row=0;
		int index=0;
		int column=0;
		int direction=n;
		for(int i=0;i<m;i++){
			if(arr[i][i]==1){
				boolean temp=false;
				for(int j=0;j<direction;j++){
					if(!temp){
						arr[i][j]=1;
						if(j==direction-1){
							direction=m;
							j=-1;
							temp=true;
							continue;
						}
					}
					if(temp){
						arr[j][i]=1;
					}
				}
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}