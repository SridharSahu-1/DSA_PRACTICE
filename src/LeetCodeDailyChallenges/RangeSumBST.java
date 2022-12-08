package LeetCodeDailyChallenges;

//  Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode1 left, TreeNode1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class RangeSumBST {
    public int rangeSumBST(TreeNode1 root, int low, int high) {
        if(root==null) return 0;

        if(root.val>=low && root.val<=high){
            return root.val + rangeSumBST(root.left,low,high) +
                             rangeSumBST(root.right,low,high);
        }
        if(root.val<low){
            return rangeSumBST(root.right,low,high);
        }
        return rangeSumBST(root.left,low,high);
    }
}