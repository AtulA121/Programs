
class BinarySearchExample {
	public static void main(String args[]){
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10,11};
		int j=arr.length-1;
		int ele=11;
		for(int i=0;i<=j;){
			int midle=(j+i)/2;
			j=midle;
			if(ele <= arr[midle]){
				if(ele == arr[j]){
					System.out.println(j);
					break;
				}else if(ele == arr[i]){
					System.out.println(i);
					break;
				}
				i++;
				j--;
			}else{
				i=j+1;
				j=arr.length-1;
			}
		}
	}
}