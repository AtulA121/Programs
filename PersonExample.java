import java.io.*;
import java.util.*;
import java.util.Comparator;
import java.util.Collections;
import java.util.function.Consumer;

class PersonExample
{
	int age;
	String name;
	
	PersonExample(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public static void main(String args[])
	{
		PersonExample p1=new PersonExample(20,"aa");
		PersonExample p2=new PersonExample(22,"bb");
		PersonExample p3=new PersonExample(20,"cc");
		PersonExample p4=new PersonExample(20,"dd");
		PersonExample p5=new PersonExample(22,"ee");
		
	/*	System.out.println("First age is :"+p1.getAge());
		System.out.println("First name is :"+p1.getName());
		
		p1.setAge(30);
		p1.setName("aa");
		
		System.out.println("First age is :"+p1.getAge());
		System.out.println("First name is :"+p1.getName());
	*/
	
		System.out.println("Added to list succefully :");
		List<PersonExample> l=Arrays.asList(p5,p4,p3,p2,p1);
		System.out.println("List is :");
		for(PersonExample ppp : l)
		{
			System.out.println("Age :"+ppp.getAge()+"  Name :"+ppp.getName());
		}
		
	//	sort a list based on name
	
	/*	Collections.sort(l,new Comparator<PersonExample>() {
			
			public int compaire(PersonExample pp1,PersonExample pp2)
			{
				return pp1.getName().compareTo(pp2.getName());
			}
			
		});
	*/
	
		Collections.sort(l,(PersonExample pp1,PersonExample pp2)->{
			
			return pp1.getName().compareTo(pp2.getName());
			
		});
		
	//Print all list	
		
		System.out.println("After sort list is :");
		for(PersonExample ppp : l)
		{
			System.out.println("Age :"+ppp.getAge()+"  Name :"+ppp.getName());
		}
		
		System.out.println("After sort list is using Lambda Expression :");
		l.forEach(new Consumer<PersonExample>()
		{
			public void accept(PersonExample p)
			{
				System.out.println("Age :"+p.getAge()+" Name :"+p.getName());
			}
		});
		
	//get Names start with a	
		GetStringExample gg=(p)->{
			
			for(PersonExample pp : p)
			 if(pp.getName().startsWith("a")==true)
			 {
				 System.out.println(pp.getName());
			 }
				
		};
		
		gg.check(l);
		
	}
}

interface GetStringExample
{
	void check(List<PersonExample> p);
}