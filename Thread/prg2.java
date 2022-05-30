class thread1 implements Runnable
{
	Thread t;
	thread1()
	{
		t=new Thread(this, " Demo Thread");
		System.out.println("Child Thread : "+t);
	}
   public void run()
   {
      try
      {
         for(int i=0;i<5;i++)
         {
            System.out.println("Child Thread "+i);
            Thread.sleep(1000);
         }   
      }
      catch(InterruptedException e)
      {
         System.out.println("Thread1 interrupted ");
      }
      System.out.println("Exiting child Thread ");      
   }
}
class ThreadDemo
{
    public static void main(String args[])
      {
         thread1 t1 = new thread1();
         t1.t.start();
         try
         {
            for(int i=0;i<5;i++)
            {
               System.out.println("Main thread :  "+i );
               Thread.sleep(500);
            }
         }
            catch(InterruptedException e)
            {
               System.out.println("Main thread interrupted ");
            }
      System.out.println("Main thread exiting ");
      }
}

