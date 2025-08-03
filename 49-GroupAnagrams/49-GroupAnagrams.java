// Last updated: 8/4/2025, 12:59:52 AM
class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> keyToAnagrams = new HashMap<>();

    for (final String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String key = String.valueOf(chars);
      keyToAnagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
    }

    return new ArrayList<>(keyToAnagrams.values());
  }
}