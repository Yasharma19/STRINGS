class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder res=new StringBuilder();

        // Sort array then take smallest and largest string from array then check their common prefix 

        int n=strs.length;
        char[] s1=strs[0].toCharArray();
        char[] s2=strs[n-1].toCharArray();
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                break;
            }
            res.append(s1[i]);
        }
        return res.toString();
    }
}
