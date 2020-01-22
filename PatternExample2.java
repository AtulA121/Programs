import java.io.*;


class PatternExample2
{
	public static void main(String args[])
	{
		int j=10;
		int temp=5;
		int k=1;
		boolean flag=true;
		for(int i=1;i<=j;i++)
		{
			if(i<j && flag==true)
			{
				System.out.print("  ");
				if(i==j-1)
				{
					i=0;
					flag=false;
				}
			}
			else
			{
				if(i<=k)
				{
					System.out.print("* ");
					flag=false;
				}
				else
				{
					System.out.println("");
					k=k+2;
					flag=true;
					j--;
					i=0;
				}
			}
			
			if(i==j)
			{
				break;
			}
			
		}
	}
}