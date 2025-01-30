package data_structures;


public class LinkedList_1_Basics_singlyLL {

    Node head;
    private int size;
    LinkedList_1_Basics_singlyLL(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next; // to point to next node
        Node(int n ){
            this.data = n;
            this.next = null;//creation of single node
            size++;
        }
    }
    public void AddressSecondLastNode(){
        Node currNode  = head;

        while(currNode.next.next!=null){
            currNode = currNode.next;
        }
        System.out.println("Address of secondlast node : "+currNode);
        System.out.println("data of secondlast node : "+currNode.data);



    }
    //add at beginning
    public void add_First(int n){
        Node newNode = new Node(n);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next=head;
        head = newNode;
    }
    public void add_last(int n){
        Node newNode = new Node(n);
        if(head == null){
            head = newNode;
            return;
        }

        Node curNode = head;//create new node to traverse the LL donot perform operation on head pointer
        while(curNode.next!=null){
            curNode = curNode.next;

        }
        curNode.next = newNode;
        System.out.println("last node address : "+newNode);
        System.out.println("last node data : "+newNode.data);


    }

    public void delete_First(){
        if(head == null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        System.out.println("Deleted First : "+head.data);
        size--;
        head = head.next;

    }
    public void Delete_Last(){
        if(head == null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        size--;
        if(head.next==null){
            head = null;
            return;
        }
        Node currNode = head;
        while(currNode.next.next!=null){
            currNode = currNode.next;
        }
        System.out.println("Delelted last : "+currNode.next.data);
        currNode.next=null;
    }
    public void deleteWithData(int n ){
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        if(head.data == n && head.next == null){
            System.out.println("Deleted node with "+head.data);
            head = null;
            return;
        }
        Node currNode = head;
        Node prevNode = head;
        while(currNode.next!=null && currNode.data!=n){
            prevNode = currNode;
            currNode = currNode.next;
        }
        if(currNode.data==n){
            System.out.println(currNode.data+" element found and deleted ");
            prevNode.next=currNode.next;
            currNode.next=null;
        }
        else {
            System.out.println(n+" element not found ");
        }

    }
    public  void printList(){
        if(head == null){
           System.out.println("LIST IS EMPTY");
            return;
        }
        Node curNode = head;//create new node to traverse the LL donot perform operation on head pointer
        while(curNode!=null){
            System.out.print(curNode.data+"-->");
            curNode = curNode.next;

        }
        System.out.println("NULL");
    }
    public void MiddleNode(){
        if(head == null){
            System.out.println("linked list is empty");
            return;
        }
        if(head.next == null){
            System.out.println("Head is middle node & only node "+head);
            return;
        }
        Node currNode = head;
        Node prevNode = head;
        while( currNode.next!=null && currNode.next.next!=null  ){
            prevNode = prevNode.next;
            currNode = currNode.next.next;
        }
        System.out.println("middle node address is "+ prevNode);
        System.out.println("middle node DATA is "+ prevNode.data);

    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
    LinkedList_1_Basics_singlyLL List = new LinkedList_1_Basics_singlyLL();
    List.add_First(2);
    List.add_First(5);
    List.add_First(4);
    List.add_last(10); //print the data and the address of the last node
    List.AddressSecondLastNode();//print the address of second last node
    List.printList();
    List.MiddleNode();
    List.deleteWithData(5);
    List.printList();
    List.MiddleNode();
    List.delete_First();
    List.Delete_Last();
    List.printList();
    System.out.println( "Size of linked list : "+List.getSize());
    }
}
