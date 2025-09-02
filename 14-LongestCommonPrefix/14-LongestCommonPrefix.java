// Last updated: 9/2/2025, 10:35:20 PM
class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        StringBuilder ans = new StringBuilder();
        int temp = num;
        if(num < 0)num = -num;
        while(num >= 1){
            ans.append((char)((num % 7) +'0'));
            num = num/7;
        }
        ans = ans.reverse();
        if(temp < 0){
            ans.insert(0 , '-');
        }
        return ans.toString();
    }
}