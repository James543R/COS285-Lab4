//Author - James Libby
public class BinaryTree {
  protected Node root;

  static class Node {
    Node right = null;
    Node left = null;
    int data;

    public Node(Node right, Node left, int data){
      this.right = right;
      this.left = left;
      this.data = data;
    }

    public Node() {

    }
  }

  public void testing(){
    
  }
}
