import java.util.Arrays;
import java.util.Comparator;

public class JobSequence {
    public static void main(String[] args) {
        // int daedline[]={4,1,1,1};
        // int profit[]={20,10,40,30};
        int jobs[][]={
            {4,20},{1,10},{1,40},{1,30}
        };
        Arrays.sort(jobs,Comparator.comparingDouble(o->o[0]));
        for (int i = 0; i < jobs.length; i++) {
            for (int j = 0; j < jobs[0].length; j++) {
                System.out.print(jobs[i][j]+" ");
                
            }
            System.out.println();
            
        }
        int profit=0;
        for (int i = 0; i < jobs.length-1; i++) {
            
            for (int j = 0; j < jobs[0].length-1; j++) {
                int sum=0;
                if(jobs[i][0]==jobs[i+1][0]){
                     
                    while(jobs[i][0]==jobs[i+1][0]) {
                        sum=Math.max(jobs[i][1],jobs[i+1][1]);
                        i++;
                    }
                   
                }
                 profit+=sum;

               
                if(jobs[i][0]<jobs[i+1][0]){
                    profit+=jobs[i+1][1];
                    
                }
                
            }
        }
        System.out.println("Total Profit : "+profit);

        
    }
    
    
}
