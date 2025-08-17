// Last updated: 8/17/2025, 6:44:53 PM
class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        backtrack(s, wordDict, result, 0, new StringBuilder());
        return result;
    }

    private void backtrack(String s, List<String> wordDict, List<String> result, int startIndex,
            StringBuilder currentSentence) {
        if (startIndex == s.length()) {
            result.add(new String(currentSentence));
            return;
        }
        for (String word : wordDict) {
            if (s.startsWith(word, startIndex)) {
                int originalLength = currentSentence.length();
                if (originalLength > 0) {
                    currentSentence.append(" ");
                }
                currentSentence.append(word);
                backtrack(s, wordDict, result, startIndex + word.length(), currentSentence);
                //set back to original length
                currentSentence.setLength(originalLength);
            }
        }
    }
}