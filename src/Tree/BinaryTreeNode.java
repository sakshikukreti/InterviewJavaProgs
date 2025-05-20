package Tree;

public class BinaryTreeNode {
	
	public static TreeNode root;
	
	public static class TreeNode
	{
		Object key;
		TreeNode left;
		TreeNode right;

		TreeNode(Object value)
		{
			this.key=value;
			this.left=null;
			this.right=null;	
		}
		
	}
	
	 // A utility function to do inorder
    // traversal of BST
    static void Inorder(TreeNode root)
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
		BinaryTreeNode tree= new BinaryTreeNode();
		tree.root= new TreeNode(10);
	    tree.root.left = new TreeNode(5);
	    tree.root.right = new TreeNode(20);
	    tree.root.left.left = new TreeNode(4);
	    tree.root.left.right = new TreeNode(8);
	    tree.root.right.left = new TreeNode(15);
	    tree.root.right.right = new TreeNode(25);
		
	//   boolean flag= searchElementInTree(tree.root,25);
	//   System.out.println(flag);
	   
	   insertion(tree.root, 2);	
	   
	   // Print inorder traversal of the BST
       Inorder(root);
	    
	  //  System.out.println(searchElementInTree(tree.root,2));
	}
	
	//Search an element in Binary Search Tree
	 public static boolean searchElementInTree(TreeNode root, int key)
	 {
		TreeNode curr= root;
		while(curr!=null)
		{
			if(key==(int)curr.key)	
			{
				return true;
				//return curr.key;
			}
			else if(key<(int)curr.key)
			{
				curr=curr.left;
			}
			else
				curr=curr.right;
		}
		return false;
		//return null;
	 }
	 
	 public static TreeNode insertion(TreeNode root, int key)
	 {
		 TreeNode curr;
		 
		 TreeNode prev=null;
		
		 TreeNode tempNode= new TreeNode(key);
		 
		 if(root==null)
		 {
			return root=tempNode;
		 }
		 else
		 {
			 curr=root;
		 }

		 while(curr!=null)
		 {
			// prev=curr;
			 if(key==(int)curr.key)
			 {
				 System.out.println("Key already exists");
			 }
			 else if(key< (int)curr.key)
			 {
				prev=curr;
				 curr=curr.left;
				/* if(curr==null) {
					 prev.left=tempNode;
					 return root;
				 }*/
			 }
			 else
			 {
				 prev=curr;
				 curr=curr.right;
				/* if(curr==null) {
					 prev.right=tempNode;
					 return root;*/
					 
				 }
				 
			 }	
		 
		 if(curr==null)
		 {
			 if(key<(int)prev.key)
			 {
				 prev.left=tempNode;
			 }
			 else
				 prev.right=tempNode;
		 }
		 return root;
	 }
}
