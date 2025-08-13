// Last updated: 8/13/2025, 12:18:36 PM
class Solution {
    public long[] sumOfThree(long num) {
        long ans=num/3;
        long[] res=new long[0];
        if((ans-1+ans+ans+1)==num){
            res=new long[3];
            res[0]=ans-1;
            res[1]=ans;
            res[2]=ans+1;
        }else if((ans+ans+1+ans+2)==num){
            res=new long[3];
            res[0]=ans;
            res[1]=ans+1;
            res[2]=ans+2;
        }
        return res;
    }
}