public class maxsubprefix {

    public static void prefix(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
            
        }
        for (int i = 0; i < prefix.length; i++) {
            int start=i;
            for (int j = i; j < prefix.length; j++) {
                int end=j;
                int curr=start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if (curr>=maxsum) {
                    maxsum=curr;
                   
                    
                }
                
            }
            
        }
        System.out.println("Maxsum is : "+maxsum);

    }
    public static void main(String[] args) {
        int arr[]={1,3,4};
        prefix(arr);
    }
}