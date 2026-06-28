class Solution {

    public void solve(int index,Map<Character,String>mp,String digits,StringBuilder sb,List<String>ans){

        if(index == digits.length()){
            ans.add(sb.toString());
            return;
        }

        String letter = mp.get(digits.charAt(index));
        for(char c : letter.toCharArray()){
            sb.append(c);
            solve(index+1,mp,digits,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        
        List<String>ans = new ArrayList<>();

        if(digits.length() == 0 || digits == null){
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

        solve(0,mp,digits,new StringBuilder(),ans);
        return ans;
    }
}
