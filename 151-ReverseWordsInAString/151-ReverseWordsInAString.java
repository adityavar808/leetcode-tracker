// Last updated: 8/4/2025, 12:58:41 AM
class Solution {
    public String reverseWords(String s) {
        return ReverseWords(s);
    }
    public static String ReverseWords(String s) {
		s = s.trim();
		String[] arr = s.split("\s+");
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans = ans + arr[i] + " ";
		}
		return ans.trim();
	}
}