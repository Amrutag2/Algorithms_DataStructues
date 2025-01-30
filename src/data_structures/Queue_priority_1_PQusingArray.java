package data_structures;

class Item{
    int value;
    int priority;
    Item(int v, int p){
        this.value=v;
        this.priority=p;
    }

}
public class Queue_priority_1_PQusingArray {
    static Item[] pr = new Item[100000];
    static int size =-1;
    static void enqueue(int value, int priority){
        size++;
        pr[size] = new Item(value,priority);
    }
    static int peek(){
        int highestP = Integer.MIN_VALUE;
        int index=-1;
        for (int i = 0; i <= size; i++) {
            if(highestP==pr[i].priority && index>-1&& pr[index].value<pr[i].value){
                index=i;
            } else if (highestP<pr[i].priority ) {
                highestP=pr[i].priority;
                index=i;
            }
        }
        return index;
    }
    static void dequeue(){
        int indx= peek();
        for (int i = indx; i <=size ; i++) {
            pr[i]=pr[i+1];
        }
        size--;
    }
    static void printQ(){
        for (int i = 0; i <= size; i++) {
            System.out.println("value : "+pr[i].value+" prioroty : "+pr[i].priority);
        }
    }
    public static void main(String[] args) {
        enqueue(10, 2);
        enqueue(14, 4);
        enqueue(16, 6);
        enqueue(12, 3);
        printQ();
        System.out.println(peek());
        dequeue();
        printQ();

    }
}
