// Last updated: 10/11/2025, 7:03:29 PM
class Solution {
    public String removeSubstring(String s, int k) {
        String stored = s;
        String pattern = "(".repeat(k) + ")".repeat(k);

        int len = pattern.length();

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            sb.append(c);

            if(sb.length() >= len && sb.substring(sb.length() - len).equals(pattern)){
                sb.delete(sb.length() - len, sb.length());
            }
        }
        return sb.toString();
    }
}