class A implements Runnable
{
   public void run()
   {
      try
      {
         for(int i=0;i<5;i++)
         {
            System.out.println("Thread  A "+i);
            Thread.sleep(200);
         }   
      }
      catch(InterruptedException e)
      {
         System.out.println("Thread A interrupted ");
      }
      System.out.println("Exiting Thread A ");      
   }
}
class B implements Runnable
   {
   public void run()
   {
      try
      {
         for(int i=0;i<5;i++)
         {
            System.out.println("Thread  B "+i);
            Thread.sleep(250);
         }   
      }
      catch(InterruptedException e)
      {
         System.out.println("Thread B interrupted ");
      }
      System.out.println("Exiting Thread B ");      
   }
}
class C implements Runnable
{
   public void run()
   {
      try
      {
         for(int i=0;i<5;i++)
         {
            System.out.println("Thread  C "+i);
            Thread.sleep(100);
         }   
      }
      catch(InterruptedException e)
      {
         System.out.println("Thread C interrupted ");
      }
      System.out.println("Exiting Thread C ");      
   }
}
class Test
{
   public static void main(String args[])
   {
      A obj1 = new A();
      Thread  t1 = new Thread(obj1);
      B obj2 = new B();
      Thread t2=new Thread(obj2);
      C obj3 = new C();
      Thread t3 = new Thread(obj3);
      t1.start(); //t1.run()
      t2.start(); // t2.run()
      t3.start(); //t3.run();     
      /*
         try
         {
            for(int i=0;i<5;i++)
            {
               System.out.println("Test thread :  "+i );
               Thread.sleep(500);
            }
         }
            catch(InterruptedException e)
            {
               System.out.println("Test thread interrupted ");
            }
     System.out.println("Test thread exiting "); 
   */
   }     
}


