class BinarySearchExample
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,3,4,6,7,9,10,24,25,46,78,80,100,1000,1001,1002,1003,1004};
		int ele=10;
		int temp=arr.length-1;
		for(int i=0;i<=temp;){
			int midle=(temp+i)/2;
			if(ele <= arr[midle]){
				if(ele == arr[midle]){
					System.out.println("Index : "+midle+" , ele : "+arr[midle]);
					break;
				}else{
					temp=midle-1;
				}
			}else{
				i=midle+1;
				temp=arr.length-1;
			}
		}
	}
}