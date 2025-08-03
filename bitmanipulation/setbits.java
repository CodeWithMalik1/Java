public class setbits {
    public static void setof1(int n){
        int count=0;
        while (n > 0) {
            if ((n & 1)!=0) {
                count++;
            }
            n=n>>1;
            
            
        }
        System.out.println(count);
    }
   public static void main(String[] args) {
    setof1(10);
    
   }
    
}
