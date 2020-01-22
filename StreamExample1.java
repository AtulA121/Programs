import java.io.*;
import java.util.*;
import java.util.stream.*;

class StreamExample1
{
	public static void main(String args[])
	{
		List<Integer> l=new ArrayList<>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(25);
		l.add(30);
		l.add(35);
		System.out.println("ArrayList is : "+l);
		int temp=30;
		List<Integer> ll=l.stream().filter(i->i==temp).collect(Collectors.toList());
		System.out.println("ArrayList is : "+ll);
		
		List<Integer> lll=l.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("ArrayList is : "+lll);
		
		Map<String,String> map=new HashMap<>();
		map.put("1","atul pisal");
		map.put("","shankar pisal");
		map.put("","shankarr pisal");
		map.put("2","shankar pisal");
		map.put("2","shankar pisall");
		System.out.println("HashMap is : "+map);
		
		Map<String,String> map1=new Hashtable<>();
		map1.put("1","atul pisal");
		map1.put("","shankar pisal");
		map1.put("","shankarr pisal");
		map1.put("2","shankar pisal");
		map1.put("2","shankar pisall");
		System.out.println("HashTable is : "+map1);
		
		Set<String> set=map.keySet();
		for(String str : set)
		{
			System.out.println(""+map.get(str));
		}
		
		Set<Map.Entry<String,String>> set2=map1.entrySet();
		for(Map.Entry mapEntry : set2)
		{
			System.out.println(""+mapEntry.getKey()+" "+mapEntry.getValue());
		}
	}
}