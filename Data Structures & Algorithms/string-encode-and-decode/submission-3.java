class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length()).append("#").append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String>list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<str.length()){
            j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            String subs = str.substring(i,j);
            int len = Integer.parseInt(subs);
            i = j+1;
            j = len+i;
            list.add(str.substring(i,j));
            i = j;
        }
        return list;
    }
}
