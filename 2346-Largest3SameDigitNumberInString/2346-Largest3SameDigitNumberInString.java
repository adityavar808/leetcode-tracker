// Last updated: 8/18/2025, 1:30:45 AM
class Solution {
    public String largestGoodInteger(String num) {
        String[] three_digits = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        for(int i = 0; i < three_digits.length; i++){
            if(num.contains(three_digits[i])){
                return three_digits[i];
            }
        }
    return "";
    }
}