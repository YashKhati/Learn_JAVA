public class Main
{
    public static void main(String[] args)
    {
        LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(1);

        list.insertLast(12);
        list.insertLast(22);
        list.display();

        list.InsertPos(9,3);
        list.display();

        System.out.println("Deleted First Element : "+list.deleteFirst());
        list.display();
        System.out.println("Deleted Last Element : "+list.deleteLast());
        list.display();


    }

}
