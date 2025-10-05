// Last updated: 10/5/2025, 8:28:06 AM
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