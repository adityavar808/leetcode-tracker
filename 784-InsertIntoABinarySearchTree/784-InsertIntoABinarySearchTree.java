// Last updated: 8/13/2025, 12:19:00 PM
class Solution {
  public TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null)
      return new TreeNode(val);
    if (root.val > val)
      root.left = insertIntoBST(root.left, val);
    else
      root.right = insertIntoBST(root.right, val);
    return root;
  }
}