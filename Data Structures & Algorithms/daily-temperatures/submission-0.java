class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;

        int[] res = new int[n];

        for(int i =0;i<n;i++){
            int count = 1;
            int j = i+1;
            while(j<n){
                if(temperatures[j] > temperatures[i]){
                    break;
                }
                j++;
                count++;
            }
            res[i] = (j == n) ? 0 : count;
        }
        return res;
    }
}
