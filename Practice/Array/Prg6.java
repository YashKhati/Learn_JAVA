import java.util.ArrayList;
import java.util.Scanner;

public class Prg6
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(5);
        list.add(12);
        list.add(31);
        list.add(42);
        list.add(2);
        list.add(10);
        System.out.println(list);

        System.out.println(list.contains(42));

        list.set(1,88);
        System.out.println(list);

        list.add(3,-1);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        //Input in List
        for (int i=0;i<5;i++)
        {
            list.add(in.nextInt());
        }
        //Display list elements
        for (int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list);

        //Capacity of Array list
        ArrayList<Integer> list1=new ArrayList<>(4);
        System.out.println(list1.size());

        //2D array list
        ArrayList<ArrayList<Integer>> list3=new ArrayList<>();
        //Initialized
        for (int i=0;i<3;i++)
        {
            list3.add(new ArrayList<>());
        }

        // Add Elements
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                list3.get(i).add(in.nextInt());
            }
        }
        System.out.println(list3);
    }
}
