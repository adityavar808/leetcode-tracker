// Last updated: 10/17/2025, 7:35:35 PM
class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        ArrayList<String>list=new ArrayList<> ();
        
        for(String str : words){
            if(isin(str, row1) || isin(str, row2) || isin(str, row3)){
                list.add(str);
            }
        }
        return list.toArray(new String[0]);
    }

    public boolean isin(String str, String row){
        str = str.toLowerCase();
        for(char c : str.toCharArray()){
            if(row.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }
}