
class Solution {

    public String encode(List<String> strs) {

        if(strs.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        
        for(String st : strs){
            sb.append(st.length()).append('#').append(st);
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String>ans = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            //System.out.println(str.substring(i,j)+ " "+i+j);
            int length = Integer.parseInt(str.substring(i,j));
            //System.out.println(length+" -> "+str.substring(i,j)+"-> "+j);
            i = j+1;
            j = i+length;
            ans.add(str.substring(i,j));
            i = j;
        }
        return ans;
    }
}
