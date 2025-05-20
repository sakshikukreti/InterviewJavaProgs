package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Tree.BinaryTree.TreeNode;

public class LevelOrderBinaryTreeTraversal {
	
		//Time Complexity and Space COmplexity O(n)
	
		/*public static TreeNode root;
		
		public static class TreeNode
		{
			int key;
			TreeNode left;
			TreeNode right;

			TreeNode(int value)
			{
				this.key=value;
				this.left=null;
				this.right=null;	
			}
			
		}*/
	
	public static List<List<Integer>> BFS(TreeNode root)
	{
		List<List<Integer>> result= new ArrayList<List<Integer>>();
		
		if(root==null)
			return result;
		
		Queue<TreeNode> nodeQ= new LinkedList <TreeNode>();
		nodeQ.add(root);
		
		while(!nodeQ.isEmpty())
		{
			int count= nodeQ.size();
			
			List<Integer> list1= new ArrayList<Integer>();
			
			for(int i=0; i<count; i++)
			{
				TreeNode node=nodeQ.remove();
				list1.add(node.key);
			
				if(node.left!=null)
				{
						nodeQ.add(node.left);
				}
				if(node.right!=null)
				{
					nodeQ.add(node.right);
				}
				
			}result.add(list1);
		}
		return result;
	}
	/*public static void main(String[] args) {
		LevelOrderBinaryTreeTraversal tree= new LevelOrderBinaryTreeTraversal();
		tree.root= new TreeNode(10);
	    tree.root.left = new TreeNode(5);
	    tree.root.right = new TreeNode(20);
	    tree.root.left.left = new TreeNode(4);
	    tree.root.left.right = new TreeNode(8);
	    tree.root.right.left = new TreeNode(15);
	    tree.root.right.right = new TreeNode(25);
	    
	   // return root;
	    
	   System.out.println(BFS(root));*/
}
//}