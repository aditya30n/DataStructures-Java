package HeapMin;

public class HeapMin {

	int[] data;
	int heapSize;
	
	public HeapMin(int size){
		data = new int[size];
		heapSize = 0;
	}
	
	public void insert(int value){
		if(heapSize == data.length)
			throw new HeapException("Heap's storage is overflow");
		else{
			heapSize++;
			data[heapSize - 1]= value;
			siftUp(heapSize -1);
		}
	}
	
	private void siftUp(int nodeIndex){
		int parentIndex, temp;
		if(nodeIndex != 0){
			parentIndex = getParentIndex(nodeIndex);
			if(data[parentIndex] > data[nodeIndex]){
				temp = data[nodeIndex];
				data[nodeIndex]= data[parentIndex];
				data[parentIndex]= temp;
				siftUp(parentIndex);
			}
		}
	}
	
	private int getParentIndex(int nodeIndex){
		return (nodeIndex-1)/2;
	}
	
	private int getLeftChild(int nodeIndex){
		return nodeIndex *2+1;
	}
	
	private int getRightChild(int nodeIndex){
		return nodeIndex*2+2;
	}
	
	public boolean isEmpty(){
		return (heapSize == 0);
	}
	public int getMinimum(int nodeIndex){
		if(isEmpty()){
			throw new HeapException("Heap is Empty");
		}
		
		return data[0];
	}
		
	public void removeMin()
	{
		if(heapSize == 0 ){
			throw new HeapException("Heap is Empty");
		}
		else{
			data[0]=data[heapSize-1];
			heapSize--;
			if(heapSize >0)
				siftDown(0);
		}
	}
	
	private void siftDown(int nodeIndex){
		int leftChildIndex, rightChildIndex, minIndex, temp;
		leftChildIndex = getLeftChild(nodeIndex);
		rightChildIndex = getRightChild(nodeIndex);
		
		if(rightChildIndex > heapSize){
			if(leftChildIndex > heapSize)
				return;
			else
				minIndex = leftChildIndex;
		}
		else{
			if(data[leftChildIndex] <= data[rightChildIndex])
				minIndex = leftChildIndex;
			else
				minIndex = rightChildIndex;
		}
		if(data[nodeIndex] > data[minIndex]){
			temp = data[minIndex];
			data[minIndex] = data[nodeIndex];
			data[nodeIndex]= temp;
			siftDown(minIndex);
		}
	
	}
	public class HeapException extends RuntimeException{
		public HeapException(String message){
			super(message);
		}
	}
}
