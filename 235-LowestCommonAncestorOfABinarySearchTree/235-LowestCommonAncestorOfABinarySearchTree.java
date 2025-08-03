// Last updated: 8/4/2025, 12:58:20 AM
class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root.val > Math.max(p.val, q.val))
      return lowestCommonAncestor(root.left, p, q);
    if (root.val < Math.min(p.val, q.val))
      return lowestCommonAncestor(root.right, p, q);
    return root;
  }
}