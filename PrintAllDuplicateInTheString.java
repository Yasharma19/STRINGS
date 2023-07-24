import java.util.*;

class HelloWorld {
    
    public static void Duplicate(String s){
        int count[]=new int[256];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0 && count[i]!=1){
                System.out.println((char)(i)+"-"+count[i]+" Times");
            }
        }
    }
    
    public static void main(String[] args) {
        String s="Yashsharma";     
        Duplicate(s);
    }
}
