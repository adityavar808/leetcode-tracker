// Last updated: 8/28/2025, 12:38:33 AM
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<Character, Queue<Pair<String, Integer>>> buckets = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++)
            buckets.put(ch, new LinkedList<>());

        for (String word : words)
            buckets.get(word.charAt(0)).offer(new Pair<>(word, 0));

        int count = 0;
        for (char c : s.toCharArray()) {
            Queue<Pair<String, Integer>> queue = buckets.get(c);
            int size = queue.size();
            while (size-- > 0) {
                Pair<String, Integer> pair = queue.poll();
                String word = pair.getKey();
                int idx = pair.getValue() + 1;
                if (idx == word.length()) count++;
                else buckets.get(word.charAt(idx)).offer(new Pair<>(word, idx));
            }
        }

        return count;
    }
}