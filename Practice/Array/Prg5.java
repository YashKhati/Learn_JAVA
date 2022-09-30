import java.util.Arrays;
import java.util.Scanner;

public class Prg5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // 2D arrays
        int[][] arr= new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        // print using for loop
        System.out.println("Print using normal nested for");
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        // print using for each loop
        System.out.println("Print using For Each Loop");
        for(int[] x:arr)
        {
            for(int j : x)
                System.out.print(j+" ");
            System.out.println();
        }
        System.out.println();

        // Jagged Array
        int[][] arr3={
                {1,2,3},
                {4,5},
                {6,7,8,9}};
        for(int i=0;i<arr3.length;i++)
        {
            for (int j=0;j<arr3[i].length;j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //print using toString()
        System.out.println("Print using toString() method");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
        // print using enhanced for loop and toString()
        System.out.println("print using enhanced for loop and toString()");
        for(int[] x: arr3)
        {
            System.out.println(Arrays.toString(x));
        }

        //Jagged Array
        int[][] arr4=new int[3][];
        arr4[0]=new int[3];
        arr4[1]=new int[2];
        arr4[2]=new int[4];
        for(int i=0;i<arr4.length;i++)
        {
            for (int j=0;j<arr4[i].length;j++)
            {
                arr4[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<arr4.length;i++)
        {
            for (int j=0;j<arr4[i].length;j++)
            {
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }
    }
}
