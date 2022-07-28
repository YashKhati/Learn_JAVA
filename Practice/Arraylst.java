import java.util.ArrayList;

class Main 
{
  public static void main(String[] args)
  {
   ArrayList<Integer> al = new  ArrayList<>();
   
   System.out.println("contents of list = "+ al);
   System.out.println("Size "+ al.size());
   
   al.add(1);
   al.add(5);
   al.add(2);
   System.out.println("contents of list = "+ al);
   System.out.println("Size "+ al.size());
   
   al.add(2, 9 );
   System.out.println("contents of list = "+ al);
   
   System.out.println("Get value at index 2 = "+ al.get(2));
//   System.out.println("Get value at index 2 = "+ al[2]); error

    System.out.println("Set value at index using set()");
    al.set(2,90);
    System.out.println("contents of list = "+ al);
    // al[2]=40; error
    System.out.println("remove value at index using remove()");
    al.remove(3);
    System.out.println("contents of list = "+ al);
    System.out.println("Size "+ al.size());
   
    ArrayList<String> al2= new ArrayList<>();
    al2.add("Hello");
    al2.add("Yash");
    al2.add("Khati");
    System.out.println("contents of list = "+ al2);
    System.out.println("Size "+ al2.size());
    System.out.println("contents of list using for loop");
    for(String itr : al2)
    {
        System.out.println(itr);
    }
    
  }
}
