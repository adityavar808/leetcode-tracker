// Last updated: 11/8/2025, 2:05:10 AM
class Solution {
    int triSum(int n){
        return (n * (n + 1)) >> 1;
    }
    public int totalMoney(int n) {
        int nWeeks = n / 7;
        int rDays = n % 7;

        return triSum(n) - 42 * triSum(nWeeks - 1) - 6 * nWeeks * rDays;
    }
}