import java.util.*;
class MatrixAdditionFifteen {
	public static void main(String args[]){
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
		List arrList=new ArrayList();
		for(int i=0;i<=arr.length-1;i++){
				outer : for(int j=0;j<=arr.length-1;j++){
						if(i!=j && (arrList.indexOf(arr[i])<0) && (arrList.indexOf(arr[j])<0) ){
							for(int k=j+1;k<=arr.length-1;k++){
								if(arr[i]+arr[j]+arr[k] == 15 && (arrList.indexOf(arr[k])<0)){
									System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
									arrList.add(arr[i]);
									arrList.add(arr[j]);
									arrList.add(arr[k]);
									break outer;
								}
							}
						}
					}
					System.out.println();
				}
		}
}