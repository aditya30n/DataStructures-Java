package BST;

public class BSTExample {
	public static void main(String[] args){
		BST bst = new BST();
		bst.add(45);
		bst.add(55);
		bst.add(35);
		bst.add(15);
		bst.add(5);
		bst.add(25);
		bst.add(50);
		bst.add(60);
		bst.print();
		System.out.println();
		bst.findMax();
		System.out.println();
		bst.levelTraversal();
		System.out.println();
		bst.printLevelByLevel();
		

	}
	
	

}
