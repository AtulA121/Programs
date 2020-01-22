import java.io.*;

class FindNumberIsPolindromOrNot
{
	public static void main(String args[])
	{
		int n=121233;
		int nn=n;
		int temp=0;
		int sum=0;
		while(n>0)
		{
			temp=n%10;
			sum=sum*10+temp;
			n=n/10;
		}
		
		if(nn==sum)
		{
			System.out.println("Number is polindrome :"+sum);
		}
		else
		{
			System.out.println("Number is not polindrome :"+nn);
		}
	}
}