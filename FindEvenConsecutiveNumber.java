import java.io.*;

class FindEvenConsecutiveNumber
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,3,4,5,6,7,8};
		int remp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(""+arr[i]);
			}
			remp=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				remp=remp*10+arr[j];
				if(remp%2==0)
				{
					System.out.print(remp+" , ");
				}
			}
			remp=0;
		}
	}
}