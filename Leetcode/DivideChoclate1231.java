import java.util.*;

public class DivideChoclate1231 {
    public static int totalMinCost(Integer hor[],Integer ver[]){
        Arrays.sort(hor,Collections.reverseOrder());
        Arrays.sort(ver,Collections.reverseOrder());
          int v=0,h=0;
        int hp=1,vp=1;
        int cost=0;
        while(h<hor.length && v<ver.length){
            if(ver[v]<=hor[h]){
                cost+=(hor[h]*vp);
                h++;
                hp++;
            }
            else{
                cost+=(hor[v]*hp);
                v++;
                vp++;

            }
        }
        while(h<hor.length){
            cost+=(ver[h]*vp);
                h++;
                hp++;

        }
        while (v<ver.length) {
             cost+=(ver[v]*hp);
                v++;
                vp++;
            
        }
        return cost;
      

    }
    public static void main(String[] args) {
        Integer horizantal[]={1,2,3,8,5};
        Integer verical[]={1,3,2};
        System.out.println(totalMinCost(horizantal, verical));


    }
    
}
