package Multithreading;



public class multhrd1 
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("Ramesh");
		System.out.println("new thread name is ");
		System.out.println(t.getId());
		System.out.println(t.getPriority());
		System.out.println(t.NORM_PRIORITY);
		System.out.println(t.MAX_PRIORITY);
		System.out.println(t.MIN_PRIORITY);
		



	}
}
