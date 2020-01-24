import java.util.*;
class InterleavingTwoArrayToThirdArray2{
	public static void main(String args[]){
		int arr1[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		int arr2[]={};
		//int size1=(int)Math.ceil((double)arr1.length/2)+(arr2.length/2); // use any one
		int size= (arr1.length/2)%2 == 0 ? (arr1.length/2+(arr2.length/2)) : (arr1.length/2+1+(arr2.length/2));
		int arr3[]=new int[size];
		List<Integer> list=new ArrayList<>();
		int temp=0;
		for(int i=0;i<arr3.length;){
			if(i<arr1.length && temp%2==0){
				arr3[i++]=arr1[temp];
				list.add(arr1[temp]);
			}
			if(i<arr2.length && temp%2!=0){
				arr3[i++]=arr2[temp];
				list.add(arr2[temp]);
			}
			temp++;
		}
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
		System.out.println(" ");
		for(Integer number : list){
			System.out.print(number+" ");
		}
	}
}