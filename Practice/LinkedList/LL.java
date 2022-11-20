public class LL
{
//    SinglyLinkedList Implementation
        private Node head;
        private Node tail;
        private  int size;

        public LL()
        {
            this.size=0;
        }

//        Insert Node in first Position
        public void insertFirst(int val)
        {
            Node node = new Node(val);
            node.next=head;
            head=node;
            if(tail==null)
            {
                tail=head;
            }
            size+=1;
        }

//    Insert Node in Last Position
    public void insertLast(int val)
    {
        if(head==null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }

//    Insert at particular Index
    public void InsertPos(int val,int idx)
    {
        if(idx==0 )
        {
            insertFirst(val);
            return;
        }
        if(idx == size)
        {
            insertLast(val);
            return;
        }
        Node temp =head;
        for(int i=1;i<idx;i++)
        {
            temp=temp.next;
        }
        Node node =new Node(val,temp.next);
        temp.next=node;
        size++;
    }

//    Deleting Node From list

    public  int deleteFirst()
    {
        int val =head.val;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        return  val;
    }

// Delete Node from Last
    public  int deleteLast()
    {
        if(size <= 1)
            return  deleteFirst();
        Node secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next =null;
        return val;
    }

    public  Node findNode(int val) // find node with value
    {
        Node node = head;
        while(node!=null)
        {
            if(node.val == val)
            {
                return  node;
            }
            node=node.next;
        }
        return  null;
    }
    public  Node get(int index) // returns reference of index element
    {
        Node node =head;
        for (int i=0;i<index;i++)
        {
            node=node.next;
        }
        return  node;
    }
    public  void display(){
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.val + " -> ");
                temp=temp.next;
            }
            System.out.println("End");
        }


    // Node Implementation
    private  class Node {
        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
            //by default reference is null
        }
    }
}

