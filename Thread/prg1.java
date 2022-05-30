class CurrentThread
{
	public static void main(String[] args)
	{
		Thread t= Thread.currentThread(); // give reference of current thread to t
		System.out.println("Current Thread name : "+t);
		t.setName("Thread yash"); // change thread name to Thread yash
		System.out.println("After Thread name changed : "+t);
		try
		{
			for(int j=5;j>0;j--)
				{
					System.out.println(j);
					Thread.sleep(1000);                               // cause of using try catch---> because other thread may want 
				}													  // to interrupt sleaping thread					
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread interrupted ");
		}
	}	
}
