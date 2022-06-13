import java.util.*;
class Div
{
        public static void main(String args[])
         {
Scanner in= new Scanner(System.in);
System.out.println("Enter 2 numbers:");
int a=in.nextInt(); 
int b=in.nextInt();
try
{
        System.out.println("Successful Division of a and b: "+(a/b));
}
catch(ArithmeticException e)
{
        System.out.println("Avoid Dividing number by zero\n"+e);
}
}
}