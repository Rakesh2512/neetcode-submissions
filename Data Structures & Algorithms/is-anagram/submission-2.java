class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] fr = new int[26];
        Arrays.fill(fr,0);

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            fr[c-'a']++;
        }

        for(int j =0;j<t.length();j++){
            char c = t.charAt(j);
            fr[c-'a']--;
        }

        for(int i=0;i<26;i++){
            if(fr[i] > 0){
                return false;
            }
        }
        return true;
    }
}
