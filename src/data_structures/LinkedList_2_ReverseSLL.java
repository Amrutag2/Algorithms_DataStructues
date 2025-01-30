package data_structures;
class Node{

    Node next;
    int data;
    Node(int n){
        this.data = n;
        this.next = null;
    }
}
public class LinkedList_2_ReverseSLL {
    public static Node reversell(Node head){
        Node currNode  = head;
        Node prevNode = null,next;
        while(currNode!=null){

            next = currNode.next;
            currNode.next = prevNode;
            prevNode= currNode;
            currNode= next;
        }
        return prevNode;
    }
    public static void printll(Node head){
        while(head!=null){
            System.out.print(head.data+" -->");
            head=head.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);
        head.next.next.next.next= new Node(5);

        System.out.print("Given Linked list is : ");
        printll(head);
        head = reversell(head);

        System.out.print("\nReversed Linked List : ");
        printll(head);


    }
}
