public class Prg1
{
    public static void main(String[] args)
    {
        //Declaration
        System.out.println("Integer Array");
        int[] ar1=new int[5];
        // integer type array of size 5 Default value 0
        for(int x : ar1)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        /*
            int[] ros; declaration of array. ros is defined in stack(compile time)
            ros=new int[5] ; initialization : object is being created in heap
            creation of object = allocation of memory (run time)
         */

        int[] ar2={23,24,12,14,15};
        for(int x : ar2)
        {
            System.out.print(x+" ");
        }
        System.out.println();

        int[] ar3=new int[5];
        for(int x : ar3)
        {
            System.out.print(x+" ");
        }

        System.out.println();
        System.out.println("Character Array");
        char[] ar5=new char[5];
        for (char x: ar5)
        {
            System.out.print(x+" ");
        }
        System.out.println();

        // Array of Objects
        System.out.println("String array");
        String[] ar4=new String[5];
        for(String x : ar4)
        {
            System.out.print(x+" ");
        }
        System.out.println();

    }
}
