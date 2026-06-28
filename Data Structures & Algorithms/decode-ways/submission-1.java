class Solution {

    public int solve(String s,int index){
        if(index == s.length()){
            return 1;
        }
        
        if(s.charAt(index) == '0'){
            return 0;
        }


        int firstDigit = solve(s,index+1);
        int secondDigit = 0;
        if(index+1 < s.length() && Integer.parseInt(s.substring(index,index+2)) <= 26){
            secondDigit = solve(s,index+2);
        }

        return firstDigit+secondDigit;
    }
    public int numDecodings(String s) {
        
        if(s.length() == 0){
            return 0;
        }

        int ans = solve(s,0);
        return ans;
    }
}
