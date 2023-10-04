
public class BTPrinting extends BinaryTree{

	/**
	 * mason beale
	 */
	public void preOrder() {
		System.out.println(root);
		preOrder(root.left);
		preOrder(root.right);
	}
	/**
	 * mason beale
	 * @param n the node to start at
	 */
	public void preOrder(Node n) {
		if(n == null) return;
		System.out.println(n.data);
		preOrder(n.left);
		preOrder(n.right);
	}
	
	/**
	 * mason beale
	 */
	public void printLeft() { 
		printLeft(root.left);
		System.out.println(root);
	}
	/**
	 * mason beale
	 * @param n the node to start at
	 */
	public void printLeft(Node n) { 
		if(n == null) return;
		printLeft(n.left);
		System.out.println(n.data);
	}
	
	public void testing() {
		BTPrinting test = new BTPrinting();
		for(int i = 0;i<10;i++) {
			test.add(i);
		}
		test.preOrder();
	}

}
