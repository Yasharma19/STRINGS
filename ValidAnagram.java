class Solution {
    public boolean isAnagram(String s, String t) {
        
        int ss=s.length();
        int tt=t.length();
        if(ss!=tt)
            return false;
        int[] arr=new int[26];
        for(int i=0;i<ss;i++){
            arr[s.charAt(i)-'a']++;   // ++counter 
        }    
        for(int i=0;i<tt;i++){
            arr[t.charAt(i)-'a']--;   //--counter means at the end all will be 0
        }   
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){  //array will be empty at the end
                return false;
            }
        }
        return true;
    }

}
