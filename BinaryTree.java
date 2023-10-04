//Author - James Libby
public class BinaryTree {
  protected Node root;

  //Node class to be used with BinaryTree
  static class Node {
    Node right, left;
    int data;

    //constructor for Node to allow creating new nodes with a right and left node and an int for data
    public Node(Node right, Node left, int data){
      this.right = right;
      this.left = left;
      this.data = data;
    }

    //empty constructor for node
    public Node() {

    }
  }

  //empty testing method
  public void testing(){
    
  }
}