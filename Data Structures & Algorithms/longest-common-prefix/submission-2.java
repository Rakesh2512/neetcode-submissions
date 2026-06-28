class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);

        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        int n = s1.length();
        int m = s2.length();
        int i = 0;
        int j = 0;

        while(i<n && j<m){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }
            else{
                break;
            }
        }
        return s2.substring(0,j);
    }
}