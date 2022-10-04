
TC=O(N)

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2DArray
{
    static  int[] search(int[][] matrix,int target)
    {
        int row=0;
        int col=matrix.length-1;
        while (row<matrix.length && col>=0)
        {
            if(matrix[row][col]==target)
            {
                return new int[]{row,col};
            }
            if(matrix[row][col]<target)
            {
                row++;
            }
            else
            {
                col--;
            }
        }
        return new  int[]{-1,-1};
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[4][4];

        // Sorted Array (row wise and column wise)
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        //Print Array
        for (int[] ints : arr)
        {
            System.out.println(Arrays.toString(ints));
        }
        int target;
        System.out.println("enter element to search : ");
        target=in.nextInt();
        System.out.println(Arrays.toString(search(arr,target)));
    }
}
