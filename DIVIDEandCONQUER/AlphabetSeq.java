import java.sql.Time;

public class AlphabetSeq {

    public static String[] printArr(String arr[],int startIndex,int endIndex){
        //base
        if (startIndex >= endIndex) {
            String[] A={arr[startIndex]};
            return A;
        }
        int mid=startIndex+(endIndex-startIndex)/2;
        String arr1[]=printArr(arr, startIndex, mid);
        String arr2[]=printArr(arr, mid+1, endIndex);
        String Arr3[]=merge(arr1,arr2);
        return Arr3;

    }
    public static String[] merge(String arr1[],String arr2[]){
        int m=arr1.length;
        int n=arr2.length;
        String[] Arr3=new String[m+n];
        int idx=0;
        int i=0;
        int j=0;
        while (i < m && j<n) {
            if(isAlphabeticallySmaller(arr1[i],arr2[j])){
                Arr3[idx]=arr1[i];
                i++;
                idx++;
            }
            else{
                Arr3[idx]=arr2[j];
                j++;
                idx++;
                
            }
            
        }
        while (i<m) {
            Arr3[idx]=arr1[i];
                i++;
                idx++;
            
        }
        while (j<n) {
            Arr3[idx]=arr2[j];
            j++;
            idx++;

            
        }
        return Arr3;

    }
    //comparing
    public static boolean isAlphabeticallySmaller(String arr1,String arr2){
        if (arr1.compareTo(arr2)<0) {
            return true;
            
        }
        else{
            return false;
        }
    }


   public static void main(String[]args) {
    String[]arr= {"sun","earth","mars","mercury"};
    String[]a=printArr(arr,0,arr.length-1);
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
}
}

