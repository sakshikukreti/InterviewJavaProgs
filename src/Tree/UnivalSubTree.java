package Tree;
//1. Compute whether I am unival or not and return true/false to the parent
//2. Based on whether I am univale or not, add 1 to global count: Local Solution-:Each node will compute whether or notthe subtree rooted at it is unival
// GLobal solution= Summation of all local solutions that are unival
public class UnivalSubTree {
	
	public static TreeNode root;
	static boolean amIUnival;
	public static int globalCount=0;

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
	        5
	       /  \
	     1     5
	    / \   	\
	   5   5	 5	
	  */
			UnivalSubTree tree= new UnivalSubTree();
		
			tree.root= new TreeNode(5);
			tree.root.left = new TreeNode(1);
	        tree.root.right = new TreeNode(5);
	        tree.root.left.left = new TreeNode(5);
	        tree.root.left.right = new TreeNode(5);
	        tree.root.right.right = new TreeNode(5);
	        
	        System.out.println(helper(root));

		}
		
		public static boolean dfs(TreeNode node)
		{
			boolean univalFlag= true;
			if(node.left==null && node.right==null) //leaf node will always be unival
			{
				globalCount++;
				return true;
			}
			
			//Recursive Case: to need to know the node is unival or not, their left and right subtree should tell whether they are unival or not
			 
			if(node.left!=null)
			{
				univalFlag=dfs(node.left);
				
				if(univalFlag==false || node.val!=node.left.val)
				{
					univalFlag=false;
				}
			}
			if(node.right!=null)
			{
				univalFlag=dfs(node.right);
				
				if(univalFlag==false || node.val!=node.right.val)
				{
					univalFlag=false;
				}
			}
			
			if(univalFlag==true)
			{
				globalCount++;
			}
			return univalFlag;
		}
		
		public static int helper(TreeNode root)
		{
			if(root==null)
			{
				return 0;
			}
			dfs(root);
			return globalCount;
		}

}
