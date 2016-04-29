
public class Session8Assignment4{
	public static void main(String[] args) {
		ThreadCount tc=new ThreadCount();

	}

}
class ThreadCount extends Thread
{ThreadCount()
{
	System.out.println("My Thread Starts");
	start();
}
public void run()
{
	try
	{
		for(int i=0;i<=10;i++)
	{
			System.out.println("Printing the Count :-> "+i);
			Thread.sleep(1000);
	}
	}
	catch(InterruptedException e)
	{
		System.out.println("My Thread Interrupted");
	}
	
}
}