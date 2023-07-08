class Solution{
    public String removeConsecutiveCharacter(String S){
        int l=S.length();
        String res="";
        
        for(int i=0;i<l;i++){
            if(i<l-1 && S.charAt(i)==S.charAt(i+1))  //Skip till same character are appearing 
                continue;
            else{    
                res+=S.charAt(i);
            }
        }
        return res;
    }
}
