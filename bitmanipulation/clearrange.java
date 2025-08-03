public class clearrange {
public static void range(int n,int i,int j){
    int a=((-1) <<(j+1));
    int b=(1<<i)-1;
    int bitmask=a|b;
    int result=n & bitmask;
    System.out.println(result);

}
    
    public static void main(String[] args) {
        System.out.println((1<<2)-1);
        range(10,2, 4);
        
    }
    
}
