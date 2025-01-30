package data_structures;

public class LinkedList_D1_Basics_DLL {
    Node head;
    Node tail;
    LinkedList_D1_Basics_DLL(){
        this.head = null;
        this.tail = null;
    }
    private int size;


    class Node{
        int n;
        Node prev;
        Node next;
        Node(int n){
            this.n = n;
            this.next=null;
            this.prev = null;
            size++;
        }
    }
    public void InsertAtBeginning(int n){
        Node temp = new Node(n);
        if(head==null){
            head = temp;
            tail= temp;
        }else{
            head.prev=temp;
            tail.next=temp;
            temp.next=head;
            head=temp;
        }
    }
    public void InsertAtEnd(int n){
        Node temp = new Node(n);
        if(tail==null){
            head = temp;
            tail = temp;

        }else{
            tail.next = temp;
            temp.prev = tail;
            tail=temp;
        }
    }
    public void InsertAtPosition(int position,int n){
        Node temp = new Node(n);
        if(position==1){
            InsertAtBeginning(n);
        }
        else{
            Node curr = head;
            int currPosition = 1;
            while(curr!=null && currPosition<position){
                curr = curr.next;
                currPosition++;

            }
            if(curr==null){
                InsertAtEnd(n);
            }else{
                temp.next = curr;
                temp.prev = curr.prev;
                curr.prev.next = temp;
                curr.prev = temp;
            }
        }
    }
    public void DeleteAtBeginning(){
        if(head==null){
            return;
        }
        if(head==tail){
            head = null;
            tail=null;
            return;
        }

            Node temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;


    }
    public void DeleteAtEnd()
    {
        if (tail == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }
    public void DeleteAtPosition(int position){
        if(head==null){
            return;
        }
        if(position==1){
            DeleteAtBeginning();
            return;
        }
        Node curr = head;
        int currposition  =1;
        while(curr!=null && currposition!=position){
            curr=curr.next;
            currposition++;
        }
        if(curr==null){
            System.out.println("Position wrong");
            return;
        }
        if (curr == tail) {
            DeleteAtEnd();
            return;
        }
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        curr.prev = null;
        curr.next = null;
    }
    public void traverseForward()
    {
        Node current = head;

        while (current != null) {
            System.out.print(current.n + " ");
            current = current.next;
        }
    }
    // Traversing from tail to the head
    public void traverseBackward()
    {
        Node current = tail;
        while (current != null) {
            System.out.print(current.n+ " ");
            current = current.prev;
        }
    }
    public static void main(String[] args) {
        LinkedList_D1_Basics_DLL l2 = new LinkedList_D1_Basics_DLL();
        l2.InsertAtBeginning(2);
        l2.InsertAtEnd(4);
        l2.InsertAtBeginning(3);
        l2.InsertAtEnd(6);
        l2.InsertAtBeginning(1);
        l2.traverseForward();
        System.out.println("#");
        l2.traverseBackward();
        System.out.println("##");

        l2.InsertAtBeginning(10);
        l2.InsertAtBeginning(11);

        l2.traverseForward();
        System.out.println("###");

        l2.DeleteAtEnd();
        l2.DeleteAtBeginning();

        l2.traverseForward();
        System.out.println("####");

        l2.InsertAtPosition(5,22);
        l2.traverseForward();
        System.out.println("####");
        l2.traverseForward();
        System.out.println("####");

        l2.DeleteAtPosition(2);
        l2.traverseForward();


    }
}
