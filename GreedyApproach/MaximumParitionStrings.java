public class MaximumParitionStrings {
    public static void Strings(String str,int n){
        int l=0,r=0,ans=0;
        for (int i = 0; i < n; i++) {

            if(str.charAt(i)=='R') r++;
            else if(str.charAt(i)=='L') l++;
            if(l==r) ans++;
  
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String str="LRRRRLLRLLRL";
        int n=str.length();
        Strings(str,n);
        
    }
    
}
