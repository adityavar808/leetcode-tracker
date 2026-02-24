// Last updated: 2/24/2026, 7:23:51 AM
1class Solution {
2    public int sumRootToLeaf(TreeNode root) {
3        return DFS(root, 0);
4    }
5
6    public int DFS(TreeNode rt, int x) {
7        if (rt==null) return 0;
8        x = x*2 + rt.val;
9        if(rt.left==rt.right) return x;
10        return DFS(rt.left, x) + DFS(rt.right, x);
11    }
12}