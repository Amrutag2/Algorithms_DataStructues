package data_structures;

//eg array[7,8,9]; enq 7,8,9
//enq front =0,rear = 2
//deq() (7) front=1;rear = 2
public class Queue_1_QueueUsingArray {
    int front, rear, capacity;
    int[] queue;
    Queue_1_QueueUsingArray(int c){
        front = -1;
        rear=-1;
        capacity = c;
        queue = new int[c];
    }
    void dequeue(){
        if(front==-1 ){
            System.out.println("Queue is empty");
            System.out.println("Cannot enter elemnt");
            return;
        }
        else {
            if(front == rear){
                front = -1;
                rear = -1;
                return;
            }
            else {
                System.out.println("DeQueue "+queue[front++]);
                return;
            }
        }
    }
    void enqueue(int n){
        if(rear == capacity-1){
            System.out.println("Queue is full ");
            System.out.println("Cannot enter elemnt");
            return;
        }
        if(front==-1){
            front++;
        }
        queue[++rear]=n;
        System.out.println("enQueue "+n);

        return;
    }
    void display(){
        if(front > rear){
            front = -1;
            rear = -1;
            System.out.println("Queue is Empty ");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.println();

    }
    void front(){
        if(rear ==-1){
            System.out.println("Queue is Empty ");
            return;
        }
        System.out.println("Front Element is: " + queue[front]);
    }

    public static void main(String[] args) {
        Queue_1_QueueUsingArray QU = new Queue_1_QueueUsingArray(5);
        QU.enqueue(60);
        QU.enqueue(50);
        QU.front();
        QU.enqueue(30);
        QU.enqueue(20);
        QU.display();
        QU.dequeue();
        QU.dequeue();
        QU.front();
        QU.display();


    }

}
