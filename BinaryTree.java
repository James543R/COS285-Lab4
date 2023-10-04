public class BinaryTree {
  protected Node root;
  
  public BinaryTree(){
	  root = null;
  }

  static class Node {
    Node right, left;
    int data;
  }

  public boolean add(int number) {
	  if(root == null) {
		  root.data = number;
		  return true;
	  }else if(number<root.data){
		  add(root.left, number);
		  return true;
	  }else if(number> root.data) {
		  add(root.right, number);
		  return true;
	  }else {
		  return false;
	  }
  }
  public boolean add(Node localRoot, int number) {
	  if(localRoot == null) {
		  localRoot.data = number;
		  return true;
	  }else if(number<localRoot.data){
		  add(localRoot.left, number);
		  return true;
	  }else if(number> localRoot.data) {
		  add(localRoot.right, number);
		  return true;
	  }else {
		  return false;
	  }
  }

  public void testing(){
    
  }
}