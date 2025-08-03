public class stocks{
    public static int bestprice(int prices[]){
        int buyprice=prices[0];
        int maxprofit=0;
        for (int i = 0; i < prices.length; i++) {
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                System.out.println(profit);
                maxprofit= Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
            
        }
        return maxprofit;

    }
    public static void main(String[] args) {
        int stk1[]={2,34,56,78,9,1};
        System.out.println("max profit : "+bestprice(stk1));
    }
}