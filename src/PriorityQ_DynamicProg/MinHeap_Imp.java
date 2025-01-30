package PriorityQ_DynamicProg;

public class MinHeap_Imp {
    private int[] Heap;
    private int size;
    private int maxSize;
    private static final int Front = 1;

    public MinHeap_Imp(int max) {
        this.maxSize = max;
        this.size = 0;
        Heap = new int[this.maxSize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos) {
        return pos > (size / 2);
    }

    private void swap(int fpos, int spos) {
        int tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    public int remove() {
        int x = Heap[Front];
        Heap[Front] = Heap[size--];
        minHeapify(Front);
        return x;
    }

    public void minHeapify(int pos) {
        if (!isLeaf(pos)) {
            int swapPos = pos;

            if (rightChild(pos) <= size)
                swapPos = Heap[leftChild(pos)] < Heap[rightChild(pos)] ? leftChild(pos) : rightChild(pos);
            else
                swapPos = leftChild(pos);

            if (Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]) {
                swap(pos, swapPos);
                minHeapify(swapPos);
            }
        }

    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2 * i] + " RIGHT CHILD :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }


    public void insert ( int element)
    {
        if (size >= maxSize) {
            return;
        }
        Heap[++size] = element;
        int current = size;

        while (Heap[current] < Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }
    public static void main (String[]arg)
    {

        // Display message
        System.out.println("The Min Heap is ");

        // Creating object of class in main() method
        MinHeap_Imp minHeap = new MinHeap_Imp(15);

        // Inserting element to minHeap
        // using insert() method

        // Custom input entries
        minHeap.insert(10);
        minHeap.insert(300);
        minHeap.insert(20);
        minHeap.insert(250);
        minHeap.insert(90);
        minHeap.insert(280);
        minHeap.insert(23);
        minHeap.insert(400);


        // Print all elements of the heap
        minHeap.print();

        // Removing minimum value from above heap
        // and printing it
        System.out.println("The Min val is "
                + minHeap.remove());
        System.out.println("deletion "+minHeap.remove());
        System.out.println("deletion "+minHeap.remove());
        System.out.println("deletion "+minHeap.remove());
        System.out.println("deletion "+minHeap.remove());
        System.out.println("deletion "+minHeap.remove());
        System.out.println("deletion "+minHeap.remove());
        System.out.println("deletion "+minHeap.remove());
        System.out.println("deletion "+minHeap.remove());
//        System.out.println("deletion "+minHeap.remove());
    }
}



