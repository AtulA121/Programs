interface Interf
{
	public void sum(int a,int b);
}

class LambdaExample
{
	public static void main(String args[])
	{
		Interf i=(a,b)->System.out.println(""+(a+b));
		i.sum(10,20);
	}
}