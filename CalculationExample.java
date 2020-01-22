import java.io.*;

class CalculationExample
{
	public static void main(String args[])
	{
		int temp=(11/2);
		for(int i=0;i<11;i++)
		{
			if(i<temp)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print("  ");
				}
				for(int m=0;m<1;m++)
				{
					System.out.print("*");
				}
			}
			else if(i==temp)
			{
				for(int k=0;k<=i;k++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(int j=10;j>i;j--)
				{
					System.out.print("  ");
				}
				for(int m=0;m<1;m++)
				{
					System.out.print("*");
				}
			}
			System.out.println("\n");
		}
	}
}