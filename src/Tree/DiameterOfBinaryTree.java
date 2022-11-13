package Tree;
//Diameter of Binary Tree
//1. Compute my height and return that to my parent which will be Max(lh, rh)+1
//2. Get the global solution from local solution by computing the inverted V path passing through me
import Tree.PathSum2.TreeNode;

public class DiameterOfBinaryTree {

public static TreeNode root;
static int globalDia;

//static int lh, rh=0;
//static int mydiameter =0;


	
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
    / \   
   3   5
  */
		DiameterOfBinaryTree tree= new DiameterOfBinaryTree();
	
		tree.root= new TreeNode(10);
       tree.root.left = new TreeNode(8);
        tree.root.right = new TreeNode(2);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(5);
       // tree.root.right.left = new TreeNode(2);
       System.out.println(helper(root));
       // helper(root);
   
	}
	
	public static int dfsDiameter(TreeNode node)
	{
		
		//Base Case If I am a leaf node
		if(node.left==null && node.right==null)
			return 0;
		
		//Recursive Case: When I am an internal node
		int mydiameter =0; int lh=0; int rh=0;
		if(node.left!=null)
		{
			lh=dfsDiameter(node.left);
			mydiameter= lh+1;	
		}
		
		if(node.right!=null)
		{
			rh=dfsDiameter(node.right);
			mydiameter= mydiameter+rh+1;
		}
		

	 globalDia= Math.max(globalDia, mydiameter);
		
		
		return Math.max(lh, rh)+1;
		
		
	}
	
	public static int helper(TreeNode root)
	{
		globalDia=0;
		if(root==null)
		{
			return 0;
		}
	
		
		dfsDiameter(root);
		return globalDia;
		
	}


}
