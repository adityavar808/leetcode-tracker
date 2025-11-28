// Last updated: 11/28/2025, 9:42:56 PM
1class Solution {
2    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
3        List<List<Integer>> adj = new ArrayList<>();
4        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());
5        for(int[] i : edges) {
6            adj.get(i[0]).add(i[1]);
7            adj.get(i[1]).add(i[0]);
8        }
9        int[] ans = new int[1];
10        dfs(adj,values,0,-1,ans,k);
11        return ans[0];
12    }
13    static int dfs(List<List<Integer>> adj, int[] values, int node, int parent, int[] ans, int k) {
14        int sum = values[node];
15        for(int temp : adj.get(node)) {
16            if(temp != parent) {
17                sum += dfs(adj,values,temp,node,ans,k);
18            }
19        }
20        if(sum % k == 0) ans[0]++;
21        return sum % k;
22    }
23}