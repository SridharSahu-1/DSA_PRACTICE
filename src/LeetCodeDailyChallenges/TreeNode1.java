package LeetCodeDailyChallenges;
//Definition for a binary tree node.
 public class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1() {}
      TreeNode1(int val) { this.val = val; }
      TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
   public boolean leafSimilar(TreeNode1 root1, TreeNode1 root2) {
       String s=ReturnLeaf(root1);
        String t=ReturnLeaf(root2);
        if(s.equals(t))
            return true;
        return false;
    }
    
    public  String ReturnLeaf(TreeNode1 root)
    {
	String p="";
        if(root==null)
            return "";
        if(root.left==null && root.right==null)//Exit condition when leaf node is found...as right and left node is null in leaf node... 
            return root.val+" ";//Here an extra space is added so that numbers like 14 and 1,4 can be differentiated....Without space it will be 14 in both the cases yeilding wrong answer 
        p=p+ReturnLeaf(root.left);//Traverse Left 
        p=p+ReturnLeaf(root.right);//Traverse right
        return p;
    }
}