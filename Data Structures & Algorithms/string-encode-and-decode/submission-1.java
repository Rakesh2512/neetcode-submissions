class Solution {

    public String encode(List<String> strs) {

        if(strs.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(String it : strs){
            sb.append(it.length()).append("#").append(it);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String>ans = new ArrayList<>();
        int i = 0;

        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            i = j+1;
            j = i + len;
            ans.add(str.substring(i,j));
            i = j;
        }
        return ans;
    }
}
