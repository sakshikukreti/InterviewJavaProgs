package Tree;

import Tree.BinaryTreeFromPreInOrderTraversal.TreeNode;

public class ConstructBinaryTreeFromSortedArray {
	
	public static TreeNode rootNode;
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructBinaryTreeFromSortedArray tree= new ConstructBinaryTreeFromSortedArray();
		int[] arr= {2,3,4,5,6,7};
		helperBST(arr, 0, arr.length);
		
		PrintInorder(rootNode);

	}
	
	  // A utility function to do inorder
	   // traversal of BST
	   static void PrintInorder(TreeNode rootNode)
	   {
	       if (rootNode == null)
	           return;
	       else {
	    	   PrintInorder(rootNode.left);
	           System.out.print(rootNode.key + " ");
	           PrintInorder(rootNode.right);
	       }
	   }
		public static TreeNode  helperBST(int[] arr, int start, int end)
		{
			if(start==end)
				return null;
			if(start<end)
				return new TreeNode (arr[start]);
			
			int mid = start+ (end-start)/2;
			rootNode= new TreeNode(arr[mid]);
			
			rootNode.left=helperBST(arr, 0, mid-1);
			rootNode.right= helperBST(arr, mid+1,end);
			
			return rootNode;
		}
	}
