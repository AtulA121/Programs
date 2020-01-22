import java.io.*;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

class SupplierExample
{
	public static void main(String args[])
	{
		Supplier<String> s=()->{
								String ss[]={"a","b","c","d"};
								int x=(int)(Math.random()*3+1);
								return ss[x];
								};
		System.out.println(""+s.get());
		System.out.println(""+s.get());
		System.out.println(""+s.get());
		
		Consumer c=(name)->{
									if(name=="add")
									{
										System.out.println(""+(10+20));
									}
									if(name=="sub")
									{
										System.out.println(""+(10-20));
									}
								
								};
		c.accept("add");
		c.accept("sub");
		
		Predicate<Integer> p=(i)->{
								if(i==10)
								{
									return true;
								}
								else
								{
									return false;
								}
							};
		System.out.println(""+p.test(10));
		System.out.println(""+p.test(20));
		
		/*Function<int,int> f=(i)->{
									if(i<50)
									{
									//	return "Less than 50";
									return i;
									}
									else
									{
									//	return "Greate than 50";
									return i;
									}
								};
		System.out.println(""+f.apply(10));
		System.out.println(""+f.apply(100));
		*/
	}
}
