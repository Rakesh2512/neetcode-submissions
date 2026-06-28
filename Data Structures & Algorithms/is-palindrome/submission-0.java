class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        int n = s.length();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString().equals(sb.reverse().toString());
    }
    
}
