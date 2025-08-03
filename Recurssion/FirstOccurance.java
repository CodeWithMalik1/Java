public class FirstOccurance {

    public static int indexprint(int arr[],int target,int i){
         i=arr.length;
        if(arr[i]==target){
            return i;
        }

        if (i<arr.length) {
            return -1;
            
        }
        
       return indexprint(arr,target,i-1);
        
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,4,3,0,9};
        System.out.println(indexprint(arr, 4, 0));
    }
    
}
