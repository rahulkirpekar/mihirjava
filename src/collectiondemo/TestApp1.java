package collectiondemo;

import java.util.LinkedList;
import java.util.List;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		LinkedList<String> mainList = new LinkedList<String>();
		mainList.add("rahul");// 0 
		mainList.add("krunal");//1
		mainList.add("rakesh");//2
		mainList.add("mihir");//3
		mainList.add("ramesh");//4
		mainList.add("sagar");//5
		mainList.add("sujal");//6
		mainList.add("shivani");//7

		System.out.println(mainList + " - " + mainList.isEmpty());
		List<String> subList= mainList.subList(3, 7);
		System.out.println(subList);
//		mainList.clear();
//		System.out.println(mainList + " - " + mainList.isEmpty());
		
		
//		mainList.set(2, "Tejas");
//		System.out.println(mainList);

		
//		System.out.println(mainList);
//		mainList.remove(1);
//		System.out.println(mainList);
//		mainList.remove("rakesh");
//		System.out.println(mainList);
		
//		ListIterator<String> itr =   mainList.listIterator();
//		while (itr.hasNext()) 
//		{
//			String name = (String) itr.next();
//			System.out.println(name);
//		} 
//		System.out.println("--------------------------");
//		while(itr.hasPrevious()) 
//		{
//			String name = (String) itr.previous();
//			System.out.println(name);
//		}
//		ArrayList<String> subList = new ArrayList<String>();
//		subList.add("dhiraj");
//		subList.add("tejas");
//		System.out.println("mainList : " + mainList);
//		System.out.println("subList : " + subList);
//		mainList.addAll(subList);
//		System.out.println("Updated mainList : " + mainList);
//		System.out.println("Updated subList : " + subList);
//		System.out.println("----------------");
//		mainList.addAll(1, subList);
//		System.out.println("Updated mainList : " + mainList);
//		System.out.println("Updated subList : " + subList);
	
	}
}
