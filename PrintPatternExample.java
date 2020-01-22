import java.io.*;

class PrintPatternExample
{
	public static void main(String args[])
	{
		int j=1;
		for(int i=0;i<5;)
		{
			if(i<j)
			{
				System.out.print("*");
				i++;
			}
			else
			{
				System.out.println("");
				i=0;
				j++;
			}
		}
	}
}