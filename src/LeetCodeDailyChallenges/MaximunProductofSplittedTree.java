package LeetCodeDailyChallenges;
/*

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class MaximunProductOfSplittedTree {
  long res = 0;

    public int maxProduct(TreeNode root) {
        long total = sum(root, 0);
        sum(root, total);
        return (int)(res%(1_000_000_007));
    }

    long sum(TreeNode n, long total) {
        if (n == null)
            return 0;
        long s = sum(n.left, total) + sum(n.right, total) + n.val;
        res = Math.max(res, (total - s)*s);
        return s;
    }
}


*/