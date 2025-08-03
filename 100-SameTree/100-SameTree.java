// Last updated: 8/4/2025, 12:58:54 AM
class Solution {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null || q == null)
      return p == q;
    return p.val == q.val &&          //
        isSameTree(p.left, q.left) && //
        isSameTree(p.right, q.right);
  }
}