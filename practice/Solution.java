package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(1);
		tn.right = new TreeNode(2);
		tn.right.left = new TreeNode(3);
	
		System.out.println(new Solution().preorderTraversal(tn));
		System.out.println(new Solution().preorderTraversalRecursive(tn));
	}

	
	public List<Integer> preorderTraversal(TreeNode node) {
		List<Integer> list = new LinkedList<Integer>();
		Stack<TreeNode> rights = new Stack<TreeNode>();
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
			
	
	public List<Integer> inOrderTraversal(TreeNode root) {
		List<Integer> list = new LinkedList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
			
		TreeNode cur = root;
		
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
		
	
	public List<Integer> preorderTraversalRecursive(TreeNode node) {
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
   	 

