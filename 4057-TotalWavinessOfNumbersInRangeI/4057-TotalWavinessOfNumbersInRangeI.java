// Last updated: 12/20/2025, 7:10:10 PM
class Solution {
    public int totalWaviness(int num1, int num2) {
        int a = (num1 + num2) / 2;
        int total = 0;

        for(int num = num1; num <= num2; num++){
            String s = String.valueOf(num);
            int n = s.length();

            if(n < 3) continue;

            int count = 0;

            for(int i = 1; i < n - 1; i++){
                int prev = s.charAt(i - 1) - '0';
                int curr = s.charAt(i) - '0';
                int next = s.charAt(i + 1) - '0';

                if(curr > prev && curr > next) count++;
                else if(curr < prev && curr < next) count++;
            }
            total += count;
        }
        return total;
    }
}