public class binomial {
    public static int nfact(int n){
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
        }
        return fact;
       
    }
    public static int rfact(int r){
        int fact=1;
        for (int i = 1; i <=r; i++) {
            fact=fact*i;
        }
        return fact;
       
    }
    public static int nrfact(int n,int r){
        int fact=1;
        for (int i = 1; i <=(n-r); i++) {
            fact=fact*i;
        }
        return fact;
       
    }
    public static int fact(int n){
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
        }
        return fact;
       
    }
    public static int bino(int n,int r){

        int n1=nfact(n);
        int n2=rfact(r);
        int n3=nrfact(n, r);
        int bino1=n1/(n2*n3);
        return bino1;
       
    }

    public static void main(String[] args) {
      int ans=  bino(5,3);
      System.out.println(ans);
        

    }
}
