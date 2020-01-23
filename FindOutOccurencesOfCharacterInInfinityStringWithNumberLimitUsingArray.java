import java.util.*;
class FindOutOccurencesOfCharacterInInfinityStringWithNumberLimitUsingArray {
	public static void main(String args[]){
		int n=11;
		int number=2;
		int count=0;
		int temp=0;
		int arr[]={2,3,4,5,2,2};
		int arr2[]=new int[arr.length];
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==number){
				arr2[temp++]=i;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr2[j]==i){
					count++;
					arr2[j]=i+arr.length;
					break;
				}
			}
		}
		System.out.println("Occurance of : "+number+" in limited list is : "+count);
	}
}
