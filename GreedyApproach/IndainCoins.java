import java.util.Arrays;

public class IndainCoins {
    public static void main(String[] args) {
        int coins[]={200,100,1,2,5,10,500,20,50,2000};
        int amount=3731;
        Arrays.sort(coins);
        int count=0;
       int i =coins.length-1; 
       while(i>=0){
        if(coins[i]<=amount){
            while(coins[i]<=amount){
            count++;
            System.out.print(coins[i]+" ");
            amount-=coins[i];
            }
           

        } 
         i--;
       }
       System.out.println();
       System.out.println(count);
    }
    
}
