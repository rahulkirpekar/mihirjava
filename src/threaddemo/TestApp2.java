package threaddemo;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Table res = new Table();
		MyThread1 t1 = new MyThread1(res);
		MyThread2 t2 = new MyThread2(res);
		
		t1.start();
		t2.start();
		
	}
}
