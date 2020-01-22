import java.io.*;
import java.util.*;
import java.util.stream.*;

class StreamExample
{
	public static void main(String args[])
	{
		List<Integer> l=new ArrayList<Integer>();
		l=Arrays.asList(10,11,20,30,40,55);
		
		System.out.println("All elements are :\n"+l);
		
		List<Integer> ll=new ArrayList<Integer>();
		
		for(Integer i : l)
		{
			if((i%2)==0)
			{
				ll.add(i);
			}
			else
			{
				System.out.println("n");
			}
		}
		System.out.println("Without using Stram :\nEven elments are :\n"+ll);
		
		
		List<Integer> lll=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("With using Stram :\nEven elments are :\n"+lll);
		
		
		List<Integer> llll=l.stream().filter(i->StreamExample.operate(i)).collect(Collectors.toList());
		System.out.println("With using Stram :\nEven elments are :\n"+llll);
		
		List<Integer> lllll=l.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("With using Stram :\nDouble the elments are :\n"+lllll);
		
		System.out.println("Total elements are :"+l.stream().count());
		
	}
	static boolean operate(Integer i)
	{
		if(i%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}