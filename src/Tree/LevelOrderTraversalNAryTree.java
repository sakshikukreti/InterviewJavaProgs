package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Tree.BinaryTree.TreeNode;

public class LevelOrderTraversalNAryTree {
	
	public static TreeNode root;
	
	public static class TreeNode
	{
		int key;
		List<TreeNode> children;

		TreeNode(int value)
		{
			this.key=value;
			children = new ArrayList<TreeNode>();
		}
		
	}	
	
	public static List<List<Integer>> NAryTraversal(TreeNode root)
	{
		List<List<Integer>> result= new ArrayList<List<Integer>>();
		if (root ==null)
			return null;

		Queue<TreeNode> queueNode = new LinkedList<TreeNode>();
		queueNode.add(root);
		
		while(!queueNode.isEmpty())
		{
			int count= queueNode.size();
			List<Integer> temp= new ArrayList<Integer>();
			for(int i =0; i<count; i++)
			{
				TreeNode node=queueNode.remove();
				temp.add(node.key);
				
				for(TreeNode child: node.children)
				{
					queueNode.add(child);
				}
				
			}result.add(temp);
		}return result;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root= new TreeNode(1);
		root.children.add(new TreeNode(3));
		root.children.add(new TreeNode(2));
		root.children.add(new TreeNode(4));
		root.children.get(0).children.add(new TreeNode(5));
		root.children.get(0).children.add(new TreeNode(6));
		
		System.out.println(NAryTraversal(root));
	}

}
