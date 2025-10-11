// Last updated: 10/11/2025, 7:03:13 PM
class Solution {
    public long maxArrayValue(int[] nums) {
        ArrayList<Long> numero = new ArrayList();
        for(int i=0;i<nums.length;i++){numero.add((long)nums[i]);}
        int i = numero.size()-1;

        while(i>0){
            if(numero.get(i) < numero.get(i-1)){
                i--;
            }
            else{
                numero.set(i, (numero.get(i) + numero.get(i-1)));
                numero.remove(i-1);
                i--;
            }
        }
        long max = 0;
        for(int j=0;j<numero.size();j++){
            max = max > numero.get(j) ? max : numero.get(i);
        }
        return max;
    }
}