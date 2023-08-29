class Solution {
    int lps(String s) {
        int n=s.length();
        int lps[]=new int[n];
        int j=0;
        int i=1;
        while(i<n){
            //If both are equal then increment both of them
            if(s.charAt(i)==s.charAt(j)){
                lps[i]=j+1;
                j++;
                i++;
            }
            //else increment only i value
            else{
                if(j==0){
                    i++;
                }
                else{
                    j=lps[j-1];
                }
            }
        }
        return lps[n-1];
    }
}
