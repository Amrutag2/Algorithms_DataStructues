package Trees;
//[10, 35, 15, 20, 25, 30,] smaklest =2
//                10
//              /   \
//          35       15
//          / \     /  \
//      20     25 30     35
//
//            MIN HEAP

import java.util.ArrayList;

public class Heap_1_MaxHeap {
    private ArrayList<Integer> heap;
    Heap_1_MaxHeap(){
        heap = new ArrayList<>();
    }
    private int parent(int i){
        return (i-1)/2;
    }
    private int LeftChild(int i){
        return 2*i+1;
    }
    private int RightChild(int i){
        return 2*i+2;
    }
    private void swap(int i,int j){
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    public boolean isEmpty() {
        return heap.isEmpty();
    }
    public void insert(int x){
        heap.add(x);
        int currentINDX = heap.size()-1;
        while(currentINDX>0&& heap.get(currentINDX)<heap.get(parent(currentINDX))){
            swap(currentINDX,parent(currentINDX));
            currentINDX = parent(currentINDX);
        }
    }
//  Extracts and returns the minimum value from the heap
    public int extractMin(){
        if (heap.isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        int min = heap.get(0);//to be removed
        int lastele = heap.remove(heap.size()-1);
        if(!heap.isEmpty()){
            heap.set(0,lastele);
            int currentIndex=0;
            while(true){
                int left = LeftChild(currentIndex);
                int right = RightChild(currentIndex);
                int smallest = currentIndex;
                if(left<heap.size() && heap.get(smallest)>heap.get(left)){
                    smallest=left;
                }
                if(right<heap.size() && heap.get(smallest)>heap.get(right)){
                    smallest=right;
                }
                if(smallest==currentIndex){
                    break;
                }
                swap(currentIndex,smallest);
                currentIndex = smallest;
            }
        }

        return min;
    }
    public static void main(String[] args) {
        Heap_1_MaxHeap minheap = new Heap_1_MaxHeap();
        minheap.insert(10);
        minheap.insert(5);
        minheap.insert(15);
        minheap.insert(20);
        minheap.insert(25);
        minheap.insert(30);
        minheap.insert(35);
        System.out.println(minheap.heap);
        System.out.println("Extracted Min: " + minheap.extractMin());
        System.out.println(minheap.heap);

        System.out.println("Extracted Min: " + minheap.extractMin());
        System.out.println(minheap.heap);

    }
}
