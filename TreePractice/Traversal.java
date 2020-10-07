package TreePractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Traversal {

	public static void main(String[] args) {
		BinaryTreeNode tn = new BinaryTreeNode(1);
		tn.right = new BinaryTreeNode(2);
		tn.right.left = new BinaryTreeNode(3);
	
		System.out.println(new Traversal().preorderTraversal(tn));
		System.out.println(new Traversal().preorderTraversalRecursive(tn));
	}

	
	public List<Integer> preorderTraversal(BinaryTreeNode node) {
		List<Integer> list = new LinkedList<Integer>();
		Stack<BinaryTreeNode> rights = new Stack<BinaryTreeNode>();
		while(node != null) {
			list.add(node.val);
			if (node.right != null) {
				rights.push(node.right);
			}
			node = node.left;
			if (node == null && !rights.isEmpty()) {
				node = rights.pop();
			}
		}
		return list;
	}
			
	
	public List<Integer> inOrderTraversal(BinaryTreeNode root) {
		List<Integer> list = new LinkedList<Integer>();
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
			
		BinaryTreeNode cur = root;
		
		while(root != null) {
		//	root = root.left;
			
			if (root.right != null) {
				stack.push(root.right);
			}
			if(root.left != null){
			list.add(root.val);
			}
			root = root.left;
			
			if (root == null && !stack.isEmpty()) {
				root = stack.pop();
			}
		}
		return list;
	}
		
	
	public List<Integer> preorderTraversalRecursive(BinaryTreeNode node) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(node.val);
		if(node.left ==null && node.right==null){
			return list;
		}else if(node.left==null){
			list.addAll(preorderTraversalRecursive(node.right));
			 return list;
		}else{			
			list.addAll(preorderTraversalRecursive(node.left));
			return list;
		}
	}
}
   	 

