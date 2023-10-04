public class BTPrinting extends BinaryTree {

	/**
	 * add to a binary search tree
	 * BTPrinting specific just in case it overlaped with other add methods
	 * @param key
	 */
	public void addBTP(int key)  { 
        root = addBTP(root, key); 
    } 
   
    private Node addBTP(Node localRoot, int num) { 
        if (localRoot == null) { 
        	localRoot = new Node(num); 
            return localRoot; 
        } 

        if (num < localRoot.data)
        	localRoot.left = addBTP(localRoot.left, num); 
        else if (num > localRoot.data)   
        	localRoot.right = addBTP(localRoot.right, num); 
        return localRoot; 
    } 
	
    /**
	 * mason beale
	 */
	public void preOrder() {
		preOrder(root);
	}

	/**
	 * mason beale
	 * @param n the node to start at
	 */
	public void preOrder(Node n) {
		if (n == null) {
			return;
		}
		System.out.print(n.data);
		preOrder(n.left);
		preOrder(n.right);
	}

	/**
	 * mason beale
	 */
	public void printLeft() {
		printLeft(root);
	}

	/**
	 * mason beale
	 * 
	 * @param n the node to start at
	 */
	public void printLeft(Node n) {
		if (n == null) {
			return;
		}
		printLeft(n.left);
		System.out.print(n.data);
	}

	public void testing() {
		BTPrinting test = new BTPrinting();
		test.addBTP(5);
		test.addBTP(3);
		test.addBTP(2);
		test.addBTP(1);
		test.addBTP(4);
		test.addBTP(7);
		test.addBTP(6);
		test.addBTP(8);
		
		System.out.println("The tree in a preorder fashion");
		test.preOrder();
		System.out.println("\nThe leftmost path of the tree");
		test.printLeft();
	}
}
