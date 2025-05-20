package Tree;

import Tree.BinaryTreeNode.TreeNode;

public class CrateInsertNodeInTree {
	
	public static Node root=null;
	public static class Node
	{
		int key;
		Node left;
		Node right;
		
		Node(int key)
		{
			this.key=key;
			this.left=null;
			this.right=null;
		}
		
		 // A utility function to do inorder
	    // traversal of BST
	    static void Inorder(Node root)
	    {
	        if (root == null)
	            return;
	        else {
	            Inorder(root.left);
	            System.out.print(root.key + " ");
	            Inorder(root.right);
	        }
	    }
		
		public static void main(String[] args) {
			CrateInsertNodeInTree tree= new CrateInsertNodeInTree();
			
			root=Insertion(tree.root, 45);
			Insertion(root, 30);
			Insertion(root, 20);
			Insertion(root, 40);
			Insertion(root, 70);
			Insertion(root, 60);
			Insertion(root, 80);
			
			// Print inorder traversal of the BST
		       Inorder(root);	
		}
		
		public static Node Insertion(Node root, int key)
		{
			Node curr;
			Node prev=null;
			Node tempNode = new Node(key);
			if(root==null)
			{
				return root=tempNode;
				
			}
			else
				curr=root;
			
			while(curr!=null)
			{
				if(key==curr.key)
				{
					 System.out.println("Key already exists");
				}
				else if(key< curr.key)
				{
					prev=curr;
					curr= curr.left;
				}
				else
				{
					prev=curr;
					curr=curr.right;
				}
			}
			if(curr==null)
			{
				if(key<prev.key)
				{
					prev.left=tempNode;
				}
				else
					prev.right=tempNode;
			}
			return root;
			
		}
		
	}
	

}
