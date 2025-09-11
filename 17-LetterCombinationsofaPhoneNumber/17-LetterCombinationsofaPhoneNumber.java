// Last updated: 9/11/2025, 11:41:18 PM
class Solution {
    static String[] map = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ll = new ArrayList<>();
        if(digits.length() == 0){
            return ll;
        }
        Combinations(digits,"",ll);
        return ll;
    }
    public static void Combinations(String ques, String ans, List<String> ll) {
        if(ques.length() == 0){
            ll.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        int num = ch - '0';
        String press = map[num];
        for (int i = 0; i < press.length(); i++) {
            Combinations(ques.substring(1), ans + press.charAt(i), ll);
        }

    }
}