// Last updated: 11/8/2025, 2:06:02 AM
class Solution {
    public int canBeTypedWords(String text, String broken) {
        Set<Character> brokenKeys = new HashSet<>();
        int count = 0;

        for (char c : broken.toCharArray()) {
            brokenKeys.add(c);
        }

        String[] words = text.split(" ");

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (brokenKeys.contains(c)) {
                    count++;
                    break;
                }
            }
        }

        return words.length - count;
    }
}