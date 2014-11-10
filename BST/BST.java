package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

	Node head;
	Node temp;
	BST(){
		head = null;
	}

	public void add(int data){
		if(head != null)
			temp = head;
		addValue(data);
	}
	public void addValue(int data)
	{		
		if(head == null)
			{
				head = new Node(data);
				temp = head;
			}
		else if(data < temp.data){
			if(temp.left == null){
				temp.left = new Node(data);
			}
			else
			{
				temp = temp.left;
				addValue(data);
			}
		}
		else{
			if(temp.right == null){
				temp.right = new Node(data);
			}
			else{
				temp = temp.right;
				addValue(data);
			}
		}
		
	}
	
	public void print(){
		inOrder(head);
	}
	public void inOrder(Node temp){
		if(temp != null){
			inOrder(temp.left);
			System.out.print(temp.data+ " ");
			inOrder(temp.right);
		}			
		}
	
	public void levelTraversal(){
		Queue<Node> queue = new LinkedList<Node>();
		Node temp1;
		queue.add(head);
		while(queue.size() > 0){
			temp1 = queue.peek();
			
			System.out.print(temp1.data + " ");
						
			if(temp1.left != null)
				queue.add(temp1.left);
			if(temp1.right != null)
				queue.add(temp1.right);

			queue.remove();
		}
	}
	public void findMax(){
		if(head.right == null)
			System.out.println("Max is: "+ head.data);
		else
		{
			temp = head;
			while(temp.right != null){
				temp = temp.right;
			}
			System.out.println("Max is: "+ temp.data);
		}
	}
	public void printLevelByLevel(){		
		printByLevel(head);
	}
	
	public static void printByLevel(Node root){
	    LinkedList<Node> curLevel = new LinkedList<Node>();
	    LinkedList<Node> nextLevel = curLevel;

	    StringBuilder sb = new StringBuilder();
	    curLevel.add(root);
	    sb.append(root.data + "\n");

	    while(nextLevel.size() > 0){
	        nextLevel = new LinkedList<Node>();
	        for (int i = 0; i < curLevel.size(); i++){
	            Node cur = curLevel.get(i);
	            if (cur.left != null) {
	                nextLevel.add(cur.left);
	                sb.append(cur.left.data + " ");
	            }
	            if (cur.right != null) {
	                nextLevel.add(cur.right);
	                sb.append(cur.right.data + " ");
	            }
	        }
	        if (nextLevel.size() > 0) {
	            sb.append("\n");
	            curLevel = nextLevel;

	        } 
	    }
	    System.out.println(sb.toString());
	}		
}