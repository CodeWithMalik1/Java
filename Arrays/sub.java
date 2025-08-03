public class sub {
    public static void sub(int arr[]){
        int total=0;
        
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            
            
            for (int j = i; j < arr.length; j++) {
                int end=j;
                int sum=0;
                
               for (int j2 = start; j2 <= end; j2++) {
                System.out.print(arr[j2]);
                
                sum=sum+arr[j2];
                 
                
               }
               System.out.println();
               System.err.println("sum is : "+sum);

              
              
               total++;
            }
            System.out.println();
           

            
            
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7};
        sub(numbers);
        
    }
    
}
