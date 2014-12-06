package Stack;

public class StackExample {
	public static void main(String args[]){
	Stack stk = new Stack(10);
	stk.push(10);
	stk.push(30);
	System.out.println(stk.peek());
	stk.pop();
	System.out.println(stk.peek());
	System.out.println(stk.isEmpty());
	
	System.out.println();
	StackLinkedList sll = new StackLinkedList();
	sll.push(5);
	sll.push(10);
	sll.push(20);
	sll.print();
	System.out.println();
	sll.pop();
	sll.print();
	}
}
