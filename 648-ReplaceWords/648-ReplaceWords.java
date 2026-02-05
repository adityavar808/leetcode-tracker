// Last updated: 2/5/2026, 11:52:35 AM
1class Solution {
2    Trie root;
3    public String replaceWords(List<String> dictionary, String sentence) {
4        root = new Trie();
5        for(String word : dictionary){
6            insert(word);
7        }
8        StringBuilder result = new StringBuilder();
9        String []  input = sentence.split(" ");
10        for(String i : input){
11            result.append(search(i));
12            result.append(" ");
13        }
14        return result.toString().trim();
15    }
16    public String search(String word){
17        Trie node = root;
18        int j = 0;
19        for(char c : word.toCharArray()){
20            int i = c - 'a';
21            j++;
22            if(node.children[i] == null){
23                return word;
24            }else if(node.children[i].isEnd){
25                return word.substring(0, j);
26            }else{
27                node = node.children[i];
28            }
29            
30        }
31        return word;
32
33    }
34    public void insert(String word){
35        Trie node = root;
36        for(char c: word.toCharArray()){
37            int i = c - 'a';
38            if(node.children[i] == null){
39                node.children[i] = new Trie();
40            }
41            node = node.children[i];
42        }
43        node.isEnd = true;
44    }
45}
46class Trie{
47    Trie [] children;
48    boolean isEnd;
49    public Trie(){
50        children = new Trie[26];
51        isEnd =false;
52    }
53} 