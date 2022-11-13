package Tree;

import java.util.HashMap;

import Tree.UnivalSubTree.TreeNode;

public class BinaryTreeFromPreInOrderTraversal {
	
    static HashMap<Integer, Integer> map1;
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
    
   public static TreeNode buildTree(int[] preorder, int[] inorder) {
       
          map1 = new HashMap<Integer,Integer> ();
        for(int i=0; i<inorder.length;i++)
        {
            map1.put(inorder[i],i);
        }
       
      return helper(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
       
   }
   
   public static TreeNode helper(int[] preorder, int startP, int endP, int[] inorder, int startI, int endI)
   {
       if(startP>endP)
           return null;
       
       if(startP==endP)
       {
           return new TreeNode(preorder[startP]);
       }
       
      root= new TreeNode(preorder[startP]);
      int rootIndex= map1.get(root.val);
       int numLeft=rootIndex-startI;
       int numRight= endI-rootIndex;
       
       root.left=helper(preorder, startP+1, startP+numLeft,inorder, startI, rootIndex-1);
       root.right=helper(preorder, startP+numLeft+1,endP, inorder, rootIndex+1, endI);
       
       return root;
   }
   
   // A utility function to do inorder
   // traversal of BST
   static void PrintInorder(TreeNode node)
   {
       if (node == null)
           return;
       else {
    	   PrintInorder(node.left);
           System.out.print(node.val + " ");
           PrintInorder(node.right);
       }
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		
		buildTree(preorder,inorder);
		PrintInorder(root);
		
	}

}
