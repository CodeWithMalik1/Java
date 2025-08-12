public class consecutivePrime {
    public static void main(String[] args) {
        int n=17;
        int sum=0;
        for(int i=2;i<=n;i++){
            int count=0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    count++;
                   
                }
               
            }
             if(count==0){
                    System.out.print(i);
                    sum=sum+i;
                }  
                if(sum==n){
                    break;
                }
                else System.out.print(" + ");
                
    }
    System.out.print(" = "+sum);
}
    
}
