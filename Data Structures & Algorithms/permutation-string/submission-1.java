class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if(n > m){
            return false;
        }

        char[] str1 = s1.toCharArray();
        Arrays.sort(str1);
        String st1 = new String(str1);

        for(int i =0;i<s2.length();i++){
            for(int j=i;j<s2.length();j++){
                String sub = s2.substring(i,j+1);
                char[] ch1 = sub.toCharArray();
                Arrays.sort(ch1);
                String st2 = new String(ch1);

                if(st1.equals(st2)){
                    return true;
                }
            }
        }
        return false;
    }
}
