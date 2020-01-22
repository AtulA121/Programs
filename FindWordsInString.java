import java.io.*;

class FindWordsInString
{
	public static void main(String args[])
	{
		String str="hii atul how are you : ";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			int ii=str.charAt(i);
			if(((ii>=97) && (ii<=122)) || ((ii>=66) && (ii<=90)))
			{
				
			}
			else	
			{
				count++;
			}
		}
		System.out.println("\n"+(count+1));
		
		count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(""+(count+1));
	}
}
