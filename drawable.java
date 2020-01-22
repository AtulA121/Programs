import java.io.*;

interface drawable
{
	public void show();
}

class draw implements drawable
{
	public void show()
	{
		System.out.println("Done :");
	}
	
	public static void main(String args[])
	{
		draw d=new draw();
		d.show();
	}
}