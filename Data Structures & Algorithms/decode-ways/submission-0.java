class Solution {
    public int solve(String s,int index,int n){

        if(index == n){
            return 1;
        }

        if(s.charAt(index) == '0'){
            return 0;
        }

        //for one character 

        int one = solve(s,index+1,n);

        // for two character 

        int two = 0;

        if(index+1 < n && Integer.parseInt(s.substring(index,index+2)) <= 26){
            two = solve(s,index+2,n);
        }

        return one + two;

    }
    public int numDecodings(String s) {
        
        int n = s.length();
        if(n == 0){
            return 0;
        }

        int ways = solve(s,0,n);
        return ways;
    }
}
