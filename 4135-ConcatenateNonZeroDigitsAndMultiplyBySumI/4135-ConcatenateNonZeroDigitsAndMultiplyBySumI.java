// Last updated: 12/20/2025, 7:10:04 PM
class Solution {
    public long sumAndMultiply(int n) {
        String x = String.valueOf(n).replace("0","");
       if(x.isEmpty()) return 0;
        int sum = 0;
        
        for(int i = 0; i < x.length(); i++){
            sum += x.charAt(i) - '0';
        }

        long finalNum = Long.parseLong(x);
        return finalNum * sum;
        
    }
}