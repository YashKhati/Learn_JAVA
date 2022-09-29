import java.util.Scanner;

public class Prg3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[] str= new String[5];
        for (int i=0;i<str.length;i++)
        {
            str[i]=in.nextLine();
        }
        for (String s:str )
        {
            System.out.print(s+" ");
        }
        System.out.println();
        str[2]="yash khati";
        for (String s:str )
        {
            System.out.print(s+" ");
        }

    }
}
