package collectiondemo.mapdemo;

import java.util.TreeMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(5,"rahul");		
		map.put(4,"kunal");		
		map.put(3,"aman");		
		map.put(2,"kunal");		
		map.put(1,"rakesh");		
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		for( Map.Entry<Integer, String> e : map.entrySet()) 
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
