// Last updated: 8/4/2025, 12:58:07 AM
class Solution {
    public int hIndex(int[] citations) {
        
        int n  = citations.length;
 Arrays.sort(citations);
 int hindex=0;
        for(int i=0;i<n;i++){
            int h =  n-i;
            if(citations[i]>=h){
                hindex =h;
                break;
            }
        }
        return hindex;
    }
}