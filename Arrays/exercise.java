public class exercise {
    public static boolean common(int arr[]){
        
        
        for (int i = 0; i < arr.length-1; i++) {   
            for (int j =i+1 ; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                  return true;   
                }             
            }
            
        }
        return false;
    }
    public static void arrIndex(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                System.out.println(i);
            }
            
        }

            
    }
    public static int stocks(int profit[]){
        int maxprice=1000;
        int maxprofit=0;
        for (int i = 0; i < profit.length; i++) {
            if (maxprice < profit[i]) {
                // int profit1=profit[i]-maxprice;
                maxprofit=Math.max(maxprofit,maxprofit);
                // System.out.println(maxprofit);
                
            }
            else{
                maxprice=profit[i];
               
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,6,5,1};
        int key=4;
        System.out.println(common(arr));
        arrIndex(arr, key);
        System.out.println(stocks(arr));
        
    }
    
}
