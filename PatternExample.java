	import java.io.*;


class PatternExample
{
	public static void main(String args[])
	{
		int j=1;
		for(int i=1;i<=j;i++)
		{
			if(i<=(j-1))
			{
				System.out.print("*");
			}
			else
			{
				j++;
				i=0;
				System.out.println("");
			}
			if(i==10)
			{
				break;
			}
		}
	}
}