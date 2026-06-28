class Solution {
    public void solve(String digits,int index,StringBuilder sb,List<String>ans,Map<Character,String>mp){
        if(index == digits.length()){
            ans.add(sb.toString());
            return;
        }

        String letter = mp.get(digits.charAt(index));
        for(char c : letter.toCharArray()){
            sb.append(c);
            solve(digits,index+1,sb,ans,mp);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {

        List<String>ans = new ArrayList<>();

        if(digits.length() == 0 ||  digits == null){
            return ans;
        }

        Map<Character,String>mp = new HashMap<>();

        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");

        solve(digits,0,new StringBuilder(),ans,mp);
        return ans;

    }
}
