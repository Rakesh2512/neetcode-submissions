class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int n = s1.length();
        int m = s2.length();

        if(n > m){
            return false;
        }

        Map<Character,Integer>mp1= new HashMap<>();

        for(char c : s1.toCharArray()){
            mp1.put(c,mp1.getOrDefault(c,0)+1);
        }

        int need = mp1.size();

        for(int i =0;i<s2.length();i++){
            Map<Character,Integer>mp2 = new HashMap<>();
            int curr = 0;
            for(int j=i;j<s2.length();j++){
                mp2.put(s2.charAt(j),mp2.getOrDefault(s2.charAt(j),0)+1);
                char ch = s2.charAt(j);
                if(mp1.getOrDefault(ch,0) < mp2.getOrDefault(ch,0)){
                    break;
                }
                if(mp1.getOrDefault(ch,0) == mp2.getOrDefault(ch,0)){
                    curr++;
                }

                if(curr == need){
                    return true;
                }
            }
        }
        return false;
    }
}
