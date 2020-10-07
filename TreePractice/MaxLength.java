package TreePractice;

//Height of a node = number of edges in logest path from node to leaf node
//Depth of node = no. of edges in path from root to that node
public class MaxLength{ 
  BinaryTreeNode root;
 
  int maxDepth(BinaryTreeNode root){ 
    // Root being null means tree doesn't exist.
    if (root == null) 
      return 0; 

    // Get the depth of the left and right subtree 
    // using recursion.
    int leftDepth = maxDepth(root.left); 
    int rightDepth = maxDepth(root.right); 

    // Choose the larger one and add the root to it.
    if (leftDepth > rightDepth) 
      return (leftDepth + 1); 
    else 
      return (rightDepth + 1); 
  } 
      
  public static void main(String[] args)  { 
/*	     1
	 2         3
   4       5       6
   		    7     8
   		     9
	  */
	  MaxLength tree = new MaxLength();          
    tree.root = new BinaryTreeNode(1);
    tree.root.left = new BinaryTreeNode(2);
    tree.root.right = new BinaryTreeNode(3);
    tree.root.left.left = new BinaryTreeNode(4);
    tree.root.right.left = new BinaryTreeNode(5);
    tree.root.right.right = new BinaryTreeNode(6);
    tree.root.right.right.left = new BinaryTreeNode(8);
    tree.root.right.left.right = new BinaryTreeNode(7);
    tree.root.right.left.right.right = new BinaryTreeNode(9);
    System.out.println("Max depth: " + tree.maxDepth(tree.root));              
    System.out.println("Height of tree: " + tree.FindHeight(tree.root));              
  }

private int FindHeight(BinaryTreeNode root) {
	
	if(root == null) {
		return 0;
	}
	
	int leftHeight = FindHeight(root.left);
	int rightHeight = FindHeight(root.right);
	
	if(leftHeight>rightHeight) {
		return leftHeight+1;
	}else {
		return rightHeight+1;
	}
	
} 
}