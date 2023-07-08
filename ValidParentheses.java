class Solution {
    public boolean isValid(String s) {
        int l=s.length();
        if(l%2!=0){
            return false;
        }

        Stack<Character> st=new Stack<Character>();

        for(int i =0;i<l;i++){
            char c=s.charAt(i);
            if(c=='[' || c=='{' || c=='('){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char ch=st.pop();
                //Condition in which there is ending before starting of brackets
                if((c==')' && ch=='(') || (c=='}' && ch=='{') || (c==']' && ch=='[')) 
                    continue;
                else
                    return false;    
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}
