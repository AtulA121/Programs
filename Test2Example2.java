import java.io.*;
import java.util.*;

class Student2
{
	int ROLLNO;
	String NAME;
}

class Test2Example2
{
	public static void main(String args[])
	{
		ArrayList<Student2> arr=new ArrayList<Student2>();
		int n=0;
		Student2 s=new Student2();
		while(n<5)
		{
			s.ROLLNO=10;
			s.NAME="Atul";
			arr.add(s);
			n++;
		}
		System.out.println(""+arr.toString());
	}
}