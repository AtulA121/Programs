import java.util.*;
class FindOutOccurencesOfCharacterInInfinityStringWithNumberLimit {
	public static void main(String args[]){
		int arr[]={2,3,4,5,2,2};
		int n=5;
		int number=2;
		int count=0;
		int maxCount=0;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==number){
				map.put(i,i);
			}
		}
		System.out.println("count : "+count);
		for(int i=0;i<n;i++){
			int index=map.containsKey(i) ? map.get(i) : -1;
			if(i==index){
				map.remove(i);
				map.put(index+arr.length,index+arr.length);
				count++;
			}
		}
		
		System.out.println("Occurance of : "+number+" in list is : "+count);
	}
}
