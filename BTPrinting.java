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

	public static void testing(BTPrinting BTP) {
		BTP.addBTP(5);
		BTP.addBTP(3);
		BTP.addBTP(2);
		BTP.addBTP(1);
		BTP.addBTP(4);
		BTP.addBTP(7);
		BTP.addBTP(6);
		BTP.addBTP(8);
	}

	public static void main(String[] args) {
		BTPrinting test = new BTPrinting();
		testing(test);
		test.preOrder();
		System.out.println();
		test.printLeft();
	}

}
