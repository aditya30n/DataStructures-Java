package Stack;

public class StackLinkedList {
	Node head;
	
	public StackLinkedList(){
		head = null;
	}
	
	public void push(int data){
		if(head == null){
			head = new Node(data);
		}
		else{
			Node temp = head;
			head = new Node(data);
			head.next = temp;
		}	
	}
	
	public void pop(){
		if(head != null)
		head = head.next;
	}
	
	public void print(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
}
