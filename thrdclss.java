package Multithreading;
//Expending thread class



class t1 extends Thread
{
	String msg;
	t1(String message)
	{
		msg=message;
	}
	public void run() 
	{
		for(int x=1;x<=5;x++)
		{
			try
			{
				System.out.println(x+"   "+msg);
				Thread.sleep(2000);
			}
			catch(Exception ee)
			{
				
			}
		}
	}
}
public class thrdclss 
{
	public static void main(String args[])throws Exception
	{
	t1 t=new t1("ramesh");
	t1 t1=new t1("himesh");
	t1 t2=new t1("gamesh");
	
	t.start();
	t.join();
	t1.start();
	t1.join();

	t2.start();
	}

}
