package threaddemo;
public class TestApp1 extends Thread
{
	public void run() 
	{
		
		for (int i = 1; i <=10; i++) 
		{
			if (Thread.currentThread().isDaemon()) 
			{
				System.out.println("I am Daemon Thread - " + Thread.currentThread().getName());
			} else 
			{
				try 
				{
					Thread.sleep(500);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() +" - I "+ " : " + i);
			}
		}
	}
	public static void main(String[] args) 
	{
		TestApp1 obj1 = new TestApp1();
		TestApp1 obj2 = new TestApp1();
		TestApp1 obj3 = new TestApp1();

		obj1.setDaemon(true);
		
		obj1.start();
		
		try {
			obj1.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		obj2.start();
		obj3.start();
		
		
		
	}
}
