// Last updated: 8/28/2025, 12:40:09 AM
class Solution {
    public boolean areOccurrencesEqual(String s) {
     Map<Character,Integer>map=new HashMap<>();
     for(char ch:s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
     }
      int temp = -1;

     for (int k : map.values()) {
      if (temp == -1) {      
           temp = k;         
        } 
        else if (k != temp) {
        return false;
      }
    }
return true;

    }
}