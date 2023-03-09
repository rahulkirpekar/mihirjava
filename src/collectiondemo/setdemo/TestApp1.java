package collectiondemo.setdemo;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> nameList = new PriorityQueue<String>();
		nameList.add("rahul");
		nameList.add("kunal");
		nameList.add("tejas");
		nameList.add("rahul");
		nameList.add("sagar");
		nameList.add("ankur");
		nameList.add("anil");
		nameList.add("shivani");
		
		System.out.println(nameList );
	}
}
