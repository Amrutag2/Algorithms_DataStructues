package data_structures;
class Node1{
    int data;
    int priority;
    Node1 next;
    Node1(int d, int p){
        this.data=d;
        this.priority=p;
        this.next=null;
    }
}
public class Queue_priority_2_PQusingLL {
    static Node1 head ;
    static void NewNode(int d, int p){
        Node1 temp = new Node1(d,p);
        head = temp;
    }
    static void push(int d, int p){
        Node1 temp = new Node1(d,p);
        if(head==null){
             NewNode(d,p);
             return;
        }
        else{
            if(head.priority<p){
                temp.next=head;
                head=temp;
            }
            else{
                Node1 start = head;
                while(start.next!=null && start.next.priority > p){
                    start=start.next;
                }
                temp.next=start.next;
                 start.next = temp;

            }
        }
    }
    static int peek(){
        return head.data;
    }
    static void pop(){
        head= head.next;
        return;
    }
    static void printLL(){
        if(isEmpty()){
            System.out.println("ll empty");
            return;
        }
        Node1 start = head;
        while(start!=null){
            System.out.println("d: "+start.data+" p: "+start.priority);
            start=start.next;

        }
        return;
    }
    static boolean isEmpty()
    {
        return ((head) == null)?true:false;
    }

    public static void main(String[] args) {
        NewNode(4,1);
        push(5,2);
        push(6,3);
        push(7,0);
        printLL();
        System.out.println(peek());
        pop();
        printLL();
    }
}
