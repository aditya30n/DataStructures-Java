package Stack;

public class Stack {
	private int top;
	private int[] storage;
	
	Stack(int capacity){
		if(capacity <= 0)
			throw new IllegalArgumentException("Must be positive");
		storage = new int[capacity];
		top = -1;
	}
	
	void push(int value){
		if(top == storage.length)
			throw new StackException("Storage overflow");
		top++;
		storage[top] = value;
	}
	
	int peek(){
		if(top == -1)
			throw new StackException("Empty");
		return storage[top];
	}
	
	void pop()
	{
		if(top == -1)
			throw new StackException("Empty");
		top--;
	}
	
	boolean isEmpty(){
		return (top == -1);
	}
	
	public class StackException extends RuntimeException {
        public StackException(String message) {
              super(message);
        }
  }
}
