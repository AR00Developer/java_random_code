import java.util.Scanner; 

public class ThreadExample 
{
	public static void main(String[] args) thorws InterruptedException
	{
		//I don't understand why make a final Object from an inner class.
		final Pc myPc = new PC(); 

		Thread thr1 = new Thread(new Runnable() 
		{
			@Override 
			public void run()
			{
				try 
				{
					myPc.produce();
				} 
				catch(Interrupted e)
				{
					e.printStackTrace();
				}
			}
		});


		Thread thr2 = new Thread(new Runnable() 
		{
			@Override 
			public void run()
			{
				try 
				{
					myPc.produce();
				} 
				catch(Interrupted e)
				{
					e.printStackTrace();
				}
			}
		});

		thr1.start();
		thr2.start();

		thr1.join();
		thr2.join();
	}
}


public static class PC 
{
	 public void produce() throws InterruptedException 
	 {
	 	synchronized(this)
	 	{
	 		System.out.println("produce thread running");
	 		wait(); 
	 		System.out.println("Resumed");
	 	}
	 }

	 public void consume() throws InterruptedException 
	 {
	 	Thread.sleep(1000); 
	 	Scanner str = new Scanner(System.in); 

	 	sychronized(this) 
	 	{
	 		System.out.println("Waiting for return key"); 
	 		str.nextLine(); 
	 		System.out.println("Return key pressed");
	 		notify(); 
	 		Thread.sleep(2000);
	 	}
	 }
	 /* Author @raiprogramming - https://github.com/raiprograming */
}





