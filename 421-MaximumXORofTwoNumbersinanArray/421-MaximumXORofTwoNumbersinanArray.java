// Last updated: 2/11/2026, 12:18:35 PM
1class Node {
2    Node[] links = new Node[2];
3
4    boolean isSet(int bit) {
5        return links[bit] != null;
6    }
7
8    Node get(int bit) {
9        return links[bit];
10    }
11
12    void put(int bit, Node node) {
13        links[bit] = node;
14    }
15}
16
17class Tries {
18    private Node root;
19
20    public Tries() {
21        root = new Node();
22    }
23
24    public void insert(int num) {
25        Node node = root;
26        for (int i = 31; i >= 0; i--) {
27            int bit = (num >> i) & 1;
28            if (!node.isSet(bit)) {
29                node.put(bit, new Node());
30            }
31            node = node.get(bit);
32        }
33    }
34
35    public int getMax(int num) {
36        Node node = root;
37        int maxi = 0;
38        for (int i = 31; i >= 0; i--) {
39            int bit = (num >> i) & 1;
40            if (node.isSet(1 - bit)) {
41                maxi |= (1 << i);
42                node = node.get(1 - bit);
43            } else {
44                node = node.get(bit);
45            }
46        }
47        return maxi;
48    }
49}
50class Solution {
51    public int findMaximumXOR(int[] nums) {
52        Tries trie = new Tries();
53        int res = 0;
54        for (int i = nums.length - 1; i >= 0; i--) {
55            trie.insert(nums[i]);
56            res = Math.max(res, trie.getMax(nums[i]));
57        }
58        return res;
59    }
60}