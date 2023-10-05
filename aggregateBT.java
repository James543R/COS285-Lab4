/*
 * Ethan Gilles
 */
public class aggregateBT extends BinaryTree {
	
	
	//copied from searchBT class i wrote
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
    
    public int sumLessThan(int n) {
    	return sumLessThan(super.root, n);
    }
    
    private int sumLessThan(Node node, int n) {
    	if(node == null)
    		return 0;
    	else if(node.data < n)
    		return sumLessThan(node.left, n) + sumLessThan(node.right, n) + n;
    	else
    		return sumLessThan(node.left, n) + sumLessThan(node.right, n);
    }
    
    public int findMax() {
    	if(root == null)
    		return -1;
    	else
    		return findMax(root, -1);
    }
    
    private int findMax(Node node, int n) {
    	if(node == null)
    		return n;
    	else if(node.data > n)
    		return node.data;
    	else
    		return n;
    }
    
    //override for the testing method on this class
    public void testing() {
		aggregateBT tree = new aggregateBT();
		
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
		
		System.out.print("results of .sumLessThan(10): ");
		System.out.println(tree.sumLessThan(10));
		System.out.print("results of .findmax() ");
		System.out.println(tree.findMax());
	}
}
