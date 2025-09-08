// Last updated: 9/8/2025, 1:50:33 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        generate_Paranthesis(n, 0, 0, "", ll);
        return ll;
    }
    public static void generate_Paranthesis(int n, int open, int close, String ans, List<String> ll){
        if(open == n && close == n){
            ll.add(ans);
            return;
        }
        if(open > n || close > open){
            return;
        }
        generate_Paranthesis(n, open + 1, close, ans + "(", ll);
        generate_Paranthesis(n, open, close + 1, ans + ")", ll);
    }
}