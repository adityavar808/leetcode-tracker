// Last updated: 8/4/2025, 1:00:08 AM
import java.util.*;

class Solution {
  public List<Integer> findSubstring(String s, String[] words) {
    List<Integer> ans = new ArrayList<>();
    if (s.isEmpty() || words.length == 0 || words[0].isEmpty())
      return ans;

    int wordLen = words[0].length();
    int wordCount = words.length;
    int totalLen = wordLen * wordCount;

    if (s.length() < totalLen)
      return ans;

    Map<String, Integer> wordMap = new HashMap<>();
    for (String word : words)
      wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);

    // Try every possible starting point in wordLen
    for (int i = 0; i < wordLen; i++) {
      int left = i, right = i, count = 0;
      Map<String, Integer> seen = new HashMap<>();

      while (right + wordLen <= s.length()) {
        String word = s.substring(right, right + wordLen);
        right += wordLen;

        if (wordMap.containsKey(word)) {
          seen.put(word, seen.getOrDefault(word, 0) + 1);
          count++;

          // Shrink window if word occurs too many times
          while (seen.get(word) > wordMap.get(word)) {
            String leftWord = s.substring(left, left + wordLen);
            seen.put(leftWord, seen.get(leftWord) - 1);
            left += wordLen;
            count--;
          }

          if (count == wordCount)
            ans.add(left);

        } else {
          // Reset if invalid word found
          seen.clear();
          count = 0;
          left = right;
        }
      }
    }

    return ans;
  }
}
