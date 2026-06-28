class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        String a = new String(ch);

        for(int i =0;i<s2.length();i++){
            for(int j = i;j<s2.length();j++){
                String subs = s2.substring(i,j+1);
                char[] chh = subs.toCharArray();
                Arrays.sort(chh);
                String b = new String(chh);

                if(a.equals(b)){
                    return true;
                }
            }
        }
        return false;
    }
}
