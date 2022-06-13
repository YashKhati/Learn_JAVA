class Ab extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print("From A: "+i+" ");
		}
	}
}
class Bc extends Thread
{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("From B: "+i);
		} 
		
	}
} 
class Cd extends Thread 
{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("From C: "+i);
		} 
		
	}
}
class XYZ
{
	public static void main(String args[]){
		Ab c=new Ab();
		Bc b=new Bc(); 
		Cd d=new Cd();
		c.start();
		b.start(); 
		d.start();
}
}
