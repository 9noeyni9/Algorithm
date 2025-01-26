import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        
        MinHeap minHeap = new MinHeap(count);
        for(int i = 0; i < count; i++){
            int number = Integer.parseInt(br.readLine());
            if(number != 0){
                minHeap.add(number);
            }else{
                bw.write(minHeap.poll()+ "\n");
            }
        }
        
        bw.flush();
        bw.close();
    }
}

class MinHeap {
	private int[] heap;
	private int size;
	private int capacity;
	
	public MinHeap(int capacity) {
		this.capacity = capacity;
		this.heap = new int[capacity];
		this.size = 0;
	}
	
	private int getParentIndex(int index) {return (index -1) /2;}
	private int getLeftChildIndex(int index) {return 2 * index + 1;}
	private int getRightChildIndex(int index) {return 2 * index + 2;}
	
	private boolean hasParent(int index) {return getParentIndex(index) >= 0;}
	private boolean hasLeftChild(int index) {return getLeftChildIndex(index) < size;}
	private boolean hasRightChild(int index) {return getRightChildIndex(index) < size;}
	
	private int parent(int index) {return heap[getParentIndex(index)];}
	private int leftChild(int index) {return heap[getLeftChildIndex(index)];}
	private int rightChild(int index) {return heap[getRightChildIndex(index)];}
	
	private void swap(int indexOne, int indexTwo) {
		int temp = heap[indexOne];
		heap[indexOne] = heap[indexTwo];
		heap[indexTwo] = temp;
	}
	
	public int peek() {
		if(size == 0) return 0;
		return heap[0];
	}
	
	public void add(int value) {
		ensureCapacity();
		heap[size] = value;
		size++;
		heapifyUp();
	}
	
	public int poll() {
		if(size == 0) return 0;
		
		int minValue = heap[0];
		heap[0] = heap[size - 1];
		size--;
		heapifyDown();
		return minValue;
	}
	
	private void ensureCapacity() {
		if(size == capacity) {
			int[] newHeap = new int[capacity * 2];
			System.arraycopy(heap, 0, newHeap, 0, capacity);
			heap = newHeap;
			capacity *= 2;
		}
	}
	
	private void heapifyUp() {
		int index = size - 1;
		while(hasParent(index) && parent(index) > heap[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}		
	}
	
	private void heapifyDown() {
		int index = 0;
		while(hasLeftChild(index)) {
			int smallerChildIndex = getLeftChildIndex(index);
			if(hasRightChild(index) && rightChild(index) < leftChild(index)) {
				smallerChildIndex = getRightChildIndex(index);
			}
			
			if(heap[index] < heap[smallerChildIndex]) {
				break;
			} else {
				swap(index, smallerChildIndex);
			}
			index = smallerChildIndex;
		}
	}
}