import java.util.Arrays;
import java.util.Scanner;

public class prg2
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        // print using for each loop
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        // print using toString() method
        System.out.print(Arrays.toString(arr));
        System.out.println();

    }

}
