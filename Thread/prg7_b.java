class A implements Runnable
{
   public void run()
   {
         for(int i=1;i<=5;i++)
         {
            System.out.println("Thread  A "+i);
         }        
      System.out.println("Exiting A ");
           
   }
}
class B implements Runnable
   {
   public void run()
   {
       for(int i=1;i<=5;i++)
         {
            System.out.println("Thread  B "+i);
         }
      System.out.println("Exiting B "); 
   }
}
class C implements Runnable
{
   public void run()
   {
      for(int i=1;i<=5;i++)
         {
            System.out.println("Thread  C "+i);
         }
      System.out.println("Exiting C ");
   }
}
class ABC
{
   public static void main(String args[])
   {
      A obj1 = new A();
      B obj2 = new B();
      C obj3 = new C();

      Thread t1 = new Thread(obj1);
      Thread t2 = new Thread(obj2);
      Thread t3 = new Thread(obj3);

      System.out.println("priority of A = "+t1.getPriority());
      System.out.println("priority of B = "+t2.getPriority());
      System.out.println("priority of C = "+t3.getPriority());
     
      t1.setPriority(9);
      t2.setPriority(2);
      t3.setPriority(6);

      System.out.println("priority of A = "+t1.getPriority());
      System.out.println("priority of B = "+t2.getPriority());
      System.out.println("priority of C = "+t3.getPriority());
 
      t1.start(); 
      t2.start(); 
      t3.start();
           
    } 
}


