public class fastmultiplication {
    public static void multiplication(int a,int n){
        int ans=1;
        while (n>0) {
            if ((n &1) !=0) {
                ans=ans*a;
                
            }
            a=a*a; 
            n=n>>1;

            
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        multiplication(2,5 );
        
    }
    
}
