// Last updated: 8/28/2025, 3:17:47 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length())
        {
            return false;
        }
        int[] counts = new int[26];
        for(char c : magazine.toCharArray())
        {
            counts[c - 'a'] ++;
        }
        for(char c : ransomNote.toCharArray())
        {
            counts[c - 'a'] --;
            if(counts[c - 'a'] < 0)
            {
                return false;
            }
        }
        return true;       
    }
}