public class solid {
    public static void solid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("-");
                
                
            }
            for (int j = 1; j <=n; j++) {
                System.out.print("* ");
                
                
            }
           
            System.out.println();

        }
    }

    public static void solid1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");

            }
            
            for (int j = 1; j <= n; j++) {
                if(i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
               
            }
           

            System.out.println();

        }

    }

    public static void main(String[] args) {
        solid(5);
        solid1(5);

    }
}
