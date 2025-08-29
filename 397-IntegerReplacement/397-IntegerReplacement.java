// Last updated: 8/30/2025, 12:06:30 AM
class Solution {

    int helper(long n){
        if(n==1) return 0;

        if(n%2==0) return 1+helper(n/2);
        else if(n==3 || n%4==1) return 1+helper(n-1);
        else return 1+helper(n+1);
    }

    public int integerReplacement(int n) {
        return helper((long) n);
    }
}