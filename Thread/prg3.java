class A implements Runnable
{
   Thread t1;
   A()
   {
      t1=new Thread(this, "Thread A");
   }
   public void run()
   {
      try
      {
         for(int i=0;i<5;i++)
         {
            System.out.println("Thread  A "+i);
            Thread.sleep(1000);
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
   Thread t2;
   B()
   {
      t2=new Thread(this, "Thread B ");
   }
   public void run()
   {
      try
      {
         for(int i=0;i<5;i++)
         {
            System.out.println("Thread  B "+i);
            Thread.sleep(1000);
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
   Thread t3;
   C()
   {
      t3=new Thread(this, "Thread C");
   }
   public void run()
   {
      try
      {
         for(int i=0;i<5;i++)
         {
            System.out.println("Thread  C "+i);
            Thread.sleep(1000);
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
      B obj2 = new B();
      C obj3 = new C();
      obj1.t1.start();
      obj2.t2.start();
      obj3.t3.start();

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
      
   }     
}


