package Multithreading;

class e1 implements Runnable
{
	String msg;
	e1(String message)
	{
		msg=message;
	}
	
	public void run() 
	{
		for(int x=1;x<=5;x++)
		{
			try
			{
				System.out.println(x+"    "+msg);
				Thread.sleep(2000);
			}
			catch(Exception ee)
			{
				
			}
		}
	}
}

public class RunnableInterfc 
{
public static void main(String args[])
{
	e1 e=new e1("rog");
    e1 e1=new e1("log");
    e1 e2=new e1("dog");
    
    
	Thread ee=new Thread(e);
	Thread b=new Thread(e1);
	Thread c=new Thread(e2);
	
	ee.start();
	b.start();
	c.start();
}
}
