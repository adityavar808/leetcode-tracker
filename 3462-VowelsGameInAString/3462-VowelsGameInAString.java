// Last updated: 10/11/2025, 7:04:02 PM
class Solution {
    public boolean doesAliceWin(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                return true;
            }
        }
        return false;
    }
}