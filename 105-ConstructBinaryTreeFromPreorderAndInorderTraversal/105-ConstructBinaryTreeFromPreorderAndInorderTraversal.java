// Last updated: 8/13/2025, 12:20:12 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void function(int[] preorder, HashMap<Integer, Integer> map, int si, int ei,  int[] start,  TreeNode node)
    {
        if(si>ei) return;

        // mid is the index where preorder[]==inorder for the node
        int mid=map.get(preorder[start[0]]);// this whole thing of finding the left part and right part from inorder array can be done using a while loop at this step if instead of map we use inorder array but map helps in finding mid in O(1)

        node.val=preorder[start[0]];
        start[0]++;

        // left node
        if (si <= mid - 1) {
            TreeNode node2=new TreeNode();
            node.left=node2;
            function(preorder, map, si, mid-1, start, node2);// taking a section of inorder[]  i.e from si to mid-1
        }

        // right node 
        if(ei>=mid+1) {
            TreeNode node3=new TreeNode();
            node.right=node3;
            function(preorder, map, mid+1, ei, start, node3);
        }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int start[]={0};
        int si=0; 
        int ei=inorder.length-1; 

        HashMap <Integer, Integer> map =new HashMap<>();
        for(int i=0; i<ei+1; i++)
        {
            map.put(inorder[i],i);
        }

        TreeNode node=new TreeNode();
        function(preorder, map,si,ei,  start,  node);

        return node;
    }
}