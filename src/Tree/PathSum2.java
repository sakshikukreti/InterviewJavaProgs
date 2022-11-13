package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Tree.BinaryTree.TreeNode;

public class PathSum2 {
	
	public static  List<List<Integer>> result= new ArrayList<List<Integer>>();
	
	public static TreeNode root;
	
	public static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		
		TreeNode(int val)
		{
			this.val=val;
			this.left=null;
			this.right=null;
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* Constructed binary tree is
        10
       /  \
     8     2
    / \   /
   3   5 2
  */
		PathSum2 tree= new PathSum2();
	
		tree.root= new TreeNode(10);
       tree.root.left = new TreeNode(8);
        tree.root.right = new TreeNode(2);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(2);	
        int sum =10;
       System.out.println(pathSum2(root, sum));
	}
	
	public static List<List<Integer>> dfsSumHelper(TreeNode node, int target, List<Integer> slate)
	{
		// List<List<Integer>> result= new ArrayList<List<Integer>>();
		 //Base Case leaf node

		if(node.left==null && node.right==null)
		{
			//if(target==node.val)
				if(target-node.val==0)
			{
				slate.add(node.val);
				result.add(new ArrayList<>(slate)); // will add the copy of Slate
				//result.add((List<Integer>) slate.clone());
				slate.remove(slate.size()-1);
				return result;
			}
		}
		if(node.left!=null)
		{
			slate.add(node.val);
			dfsSumHelper(node.left,target-node.val,slate);
			slate.remove(slate.size()-1);
		}
		
		if(node.right!=null)
		{
			slate.add(node.val);
			dfsSumHelper(node.right,target-node.val,slate);
			slate.remove(slate.size()-1);;
		}
		
		return result;	
	}

	public static List<List<Integer>> pathSum2(TreeNode root, int target){
		
		List<Integer> slate = new ArrayList<Integer>();
			if(root==null)
			{
				return result;
			}
		
		
		dfsSumHelper(root,target, slate);
		
		return result;
		
	}
}
