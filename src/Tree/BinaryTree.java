package Tree;

import Tree.BinaryTreeNode.TreeNode;

public class BinaryTree {
	
	public static TreeNode root;
	
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
		
	}
	
	 // A utility function to do inorder
    // traversal of BST
   public static void Inorder(TreeNode root)
    {
        if (root == null)
            return;
        else {
        	if(root.left!=null)
            Inorder(root.left);
            System.out.print(root.key + " ");
            if(root.right!=null)
            Inorder(root.right);
        }
    }
	
	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree();
		/*tree.root= new TreeNode(10);
	    tree.root.left = new TreeNode(5);
	    tree.root.right = new TreeNode(20);
	    tree.root.left.left = new TreeNode(4);
	    tree.root.left.right = new TreeNode(8);
	    tree.root.right.left = new TreeNode(15);
	    tree.root.right.right = new TreeNode(25);*/
	 /* Constructed binary tree is
        10
       /  \
     8     2
    / \   /
   3   5 2
  */
	    
	    tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(8);
        tree.root.right = new TreeNode(2);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(2);
		
		/*tree.root = new TreeNode(5);
        tree.root.left = new TreeNode(4);
        tree.root.right = new TreeNode(8);
        tree.root.left.left = new TreeNode(11);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(2);*/
	    
	  //  Inorder(root);
	    
	 //  System.out.println(LevelOrderBinaryTreeTraversal.BFS(root));
	    int sum=10;
	 
	    
	 System.out.println(PathSum.helper(root, sum)); 
	    
	    // Function call
      /*  if (PathSum.helper(root, sum))
            System.out.println(
                "There is a root to leaf path with sum "
                + sum );
        else
            System.out.println(
                "There is no root to leaf path with sum "
                + sum);*/
	    }
	
	

}
