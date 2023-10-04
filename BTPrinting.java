
public class BTPrinting extends BinaryTree<Integer>{

	public void preOrder() {
		System.out.println(root);
		preOrder(root.left);
		preOrder(root.right);
	}
	public void preOrder(Node n) {
		if(n == null) return;
		System.out.println(n.data);
		preOrder(n.left);
		preOrder(n.right);
	}
	
	public void printLeft() { 
		printLeft(root.left);
		System.out.println(root);
	}
	public void printLeft(Node n) { 
		if(n == null) return;
		printLeft(n.left);
		System.out.println(n.data);
	}
	
	public void testing() {
		BinaryTree<Integer> test = new BinaryTree<Integer>(0);
		for(int i = 1;i<10;i++) {
			
		}
	}

}
