// Last updated: 8/4/2025, 12:58:06 AM
class Solution {
    public int hIndex(int[] c) {
        int x=0;
        for(int i=0, n=c.length, j=n-1, m=0; i<=j;x=i, m=(i+j)/2){
            if(c[m]==n-m) return n-m;
            if(c[m]<n-m) i=m+1;
            else j=m-1;
        }
        return c.length-x;
    }
}