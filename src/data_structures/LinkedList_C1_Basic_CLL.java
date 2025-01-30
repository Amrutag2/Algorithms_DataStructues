package data_structures;

public class LinkedList_C1_Basic_CLL {
    Node head;
    Node tail;
    private int size;
    public int getSize(){
        return size;
    }
    LinkedList_C1_Basic_CLL(){
        this.head = null;
        this.tail = null;
        size=0;
    }


    class Node{
        int n;
        LinkedList_C1_Basic_CLL.Node next;
        Node(int n){
            this.n = n;
            this.next=null;
            size++;
        }
    }
    public void InsertAtBeginning(int n){
        Node newNode = new Node(n);
        if(head==null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }

        else {
           newNode.next = tail.next;
           tail.next = newNode;
           head = newNode;

        }
    }
    public void InserAtEnd(int n){
        Node newNode = new Node(n);
        if(tail==null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else{
            newNode.next = head;
            tail.next = newNode;
            tail=newNode;
        }
    }
    public void InsertAtPosition(int n , int position){

        if(head==null){
            if(position!=1){
                System.out.println("Invalid position");
                return;
            }
            Node newNode = new Node(n);
            head=newNode;
            tail=newNode;
            newNode.next = head;
            return;
        }

        Node newNode = new Node(n);
        Node current = head;//pointing to the 1 position before insertion
        if(position==1){
            InsertAtBeginning(n);
            return;
        }
        for (int i = 1; i < position-1; i++) {
            current=current.next;
            if(current==tail.next){
                System.out.println("Invalid position!");
                return ;
            }
        }
        newNode.next = current.next;
        current.next = newNode;
        if (current == tail)
            tail = newNode;

        return;

    }
    public int DeleteFirstNode(){
        if(head==null){
            System.out.println("invalid operation ll empty");
            return -1;
        }
        if(head==tail){
            int x = head.n;
            return x;
        }
        int x = head.n;
        tail.next = head.next;
        head= head.next;

        return x;

    }
    public int DeleteLastNode(){
        if(tail==null){
            System.out.println("invalid operation ll empty");
            return -1;
        }
        if(head==tail){
            int x = head.n;
            head = null;
            tail=null;
            return x;
        }
        int x = tail.n;
        Node curr = head;
        while(curr.next!=tail){
            curr = curr.next;
        }
        curr.next = head;
        return x;
    }
    public int DeleteSpecificPosition(int key){
        if(head==null){
            System.out.println("invalid operation ll empty");
            return -1;
        }
        Node curr = head;
        Node prev = tail;
        if(head==tail && head.n==key){ //only one node in ll
            int x = head.n;
            head = null;
            tail=null;
            return x;
        }
        if(curr.n==key){//1st node is key
            head = curr.next;
            return curr.n;
        }
        while (curr != tail && curr.n != key) {
            prev = curr;
            curr = curr.next;
        }

        // If the node to be deleted is found
        if (curr.n == key) {
            prev.next = curr.next;
            if (curr == tail)
            {
                tail = prev;
            }
            return key;
        }
        else {

            System.out.println("Node with data " + key
                    + " not found.");
            return -1;
        }

    }
    public void printList() {
        Node current = head;
       if(head==null){
           System.out.println("empty list");
       }
       else{
           while (true) {
               System.out.print(current.n + " ");
               current = current.next;
               if ( current.next==head){
                   System.out.print(current.n + " ");
                   break;
               }

           }

       }
    }
    public static void main(String[] args){
        LinkedList_C1_Basic_CLL l2 = new LinkedList_C1_Basic_CLL();
        // Create circular linked list: 2, 7, 5
        l2.InsertAtBeginning(2);
        l2.InsertAtBeginning(7);
        l2.InsertAtBeginning(5);
        l2.InserAtEnd(56);
        l2.InserAtEnd(60);
        l2.InsertAtBeginning(59);

        l2.InsertAtPosition(49,2);
        l2.InsertAtPosition(90,6);

        System.out.print("List after insertion: ");
        l2.printList();
        System.out.println("deleted : "+l2.DeleteFirstNode());
        System.out.print("List after insertion: ");
        l2.printList();
        System.out.println("deleted : "+l2.DeleteLastNode());
        System.out.print("List after insertion: ");
        l2.printList();
        System.out.println("deleted : "+l2.DeleteSpecificPosition(2));
        System.out.print("List after insertion: ");
        l2.printList();

    }
}
