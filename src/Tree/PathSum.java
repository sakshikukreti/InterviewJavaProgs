package Tree;

import Tree.BinaryTree.TreeNode;

public class PathSum {
	
	public static boolean psFlag=false;		//TimeComplexity = O(n log n) S(n)=O(n log n)
	
	public static void main(String[] args) {
		
	}

	public static boolean dfs(TreeNode node, int target)
	{
		//boolean psFlag= false;
		// #Edge Case- Leaf Node	
		if(node.left==null && node.right==null)
		{ //if(target==node.key)
			if(target-node.key== 0)
			 return psFlag=true;
		}	
	
		//Recursive Case for subordinates on internal node
		if(node.left!=null)
			dfs(node.left,target-node.key);
		if(node.right!=null)
			dfs(node.right,target-node.key);
		return psFlag;
		
	}
	
	public static boolean helper(TreeNode root, int target)
	{
		
		 //boolean psFlag=false;
		if(root==null)
			return false;
	
		
		dfs(root, target);
		return psFlag;
	}
}
