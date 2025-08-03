public class permutation {
    public static void printPermutations(String str,String newstr){
        if(str.length()==0){
            System.out.println(newstr);
            return;
        }
        for (int j = 0; j < str.length(); j++) {
            char curr=str.charAt(j);
            String newStr=str.substring(0,j)+str.substring(j+1);


               printPermutations(newStr, newstr+curr);
        }
     

    }
    public static void main(String[] args) {
        printPermutations("abc", "");
        
    }
    
}
