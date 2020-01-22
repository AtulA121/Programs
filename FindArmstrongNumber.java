import java.io.*;

class FindArmstrongNumber
{
	public static void main(String args[])
	{
		int n=1533;
		int temp=n;
		int sum=0;
		int remp=0;
		while(n>0)
		{
			remp=n%10;
			sum=sum+remp*remp*remp;
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Number is Armstrong :"+sum);
		}
	}
}