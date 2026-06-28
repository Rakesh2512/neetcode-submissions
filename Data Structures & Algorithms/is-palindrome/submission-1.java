class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            if(Character.isLetterOrDigit(s.charAt(i))){
                char c = Character.toLowerCase(s.charAt(i));
                sb.append(c);
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
