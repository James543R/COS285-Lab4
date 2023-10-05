/* Ethan Gilles
 * 
 * 
 * 
 */

public class searchBT extends BinaryTree {
	
	//binary tree add method to add everything into the tree in order
	public void add(int n) {
        super.root = add(super.root, n);
    }
	
    private Node add(Node node, int n) {
        if (node == null) {
            node = new Node(n);
            return node;
        }

        if (n < node.data) {
            node.left = add(node.left, n);
        } else if (n > node.data) {
            node.right = add(node.right, n);
        }

        return node;
    }
	
	//public access method
	public boolean contains(int n) {
		if(super.root = null)
			return false;
		return contains(super.root, n);
	}
	
	//private recursive method
	private boolean contains(Node node, int n) {
		if(node == null) {
			return false;
		}
		if(node.data == n) {
			return true;
		}
		return contains(node.left) || contains(node.right);
	}
	
	
	//public access method
	public int getLevel(int n) {
		if(super.root == null)
			return -1;
		return
			getLevel(root, n);
	}
	
	//private recursive method
	private int getLevel(Node node, int n) {
		if(node == null)
			return 0;
		if(n == node.data)
			return 1;
		return getLevel(node.left) + getLevel(node.right) + 1;
		
	}
	
	// Override of the testing method in Binary Tree
	public void testing() {
		searchBT tree = new BinaryTree();
		
		tree.add(1);
		tree.add(8);
		tree.add(5);
		tree.add(3);
		tree.add(12);
		tree.add(9);
		tree.add(6);
		tree.add(2);
		tree.add(8);
		tree.add(15);
		tree.add(14);
		
		System.out.print("results of .contains(8): ");
		System.out.println(tree.contains(8));
		System.out.print("results of .getLevel(9): ");
		System.out.println(tree.getLevel(9));
	}
	
	
}
