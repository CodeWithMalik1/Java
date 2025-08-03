public class clearlastibits {

    public static void lastibits(int n, int i){
       int  updated=n & ((-1) <<i);
       System.out.println(updated);
    }


    public static void main(String[] args) {
        int n=15,i=2;
        lastibits(n, i);


        
    }
    
}
