import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        String s="Yash Sha";
        Set S=new HashSet();
        for(int i=0;i<s.length();i++){
            if(!S.add(s.charAt(i))){ 
                System.out.println("Duplicate Element is "+s.charAt(i));
            }
        }
    }
}
