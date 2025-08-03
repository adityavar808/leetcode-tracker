// Last updated: 8/4/2025, 12:57:57 AM
class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String,List<Pair>> map = new HashMap();

        for(int i =0;i<equations.size();i++){
            map.putIfAbsent(equations.get(i).get(0),new ArrayList<Pair>());
            map.get(equations.get(i).get(0)).add(new Pair(equations.get(i).get(1),values[i]));

            map.putIfAbsent(equations.get(i).get(1),new ArrayList<Pair>());
            map.get(equations.get(i).get(1)).add(new Pair(equations.get(i).get(0),1/values[i]));
        }
        double[] answer = new double[queries.size()];
        for(int i =0;i<queries.size();i++){
            double ans = dfs(map,new HashSet(),queries.get(i).get(0),queries.get(i).get(1));
            answer[i] = ans;
            
        }

        return answer;


    }
    public static double dfs(HashMap<String,List<Pair>> map, Set<String> visited,String numerator, String denominator){
        if(visited.contains(numerator))return -1;
        
        visited.add(numerator);

        List<Pair> arr = map.get(numerator);

        double ans = 1;
        if(map.containsKey(numerator)){
        for(int i =0;i<arr.size();i++){

            Pair div = arr.get(i);
            String divisor = div.divisor;
            double value = div.value;

            if(divisor.equals(denominator)){
                return value;
            }
            else{
                double temp = dfs(map,visited,divisor,denominator);
                if(temp > 0){
                    ans = value*temp;
                    return ans;
                }
                
            }

        }
        }



        visited.remove(numerator);
        return -1;

    }
}
class Pair{
    String divisor;
    double value;

    Pair(String divisor, double value){
        this.divisor = divisor;
        this.value = value;
    }
}