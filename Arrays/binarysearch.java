public class binarysearch {
    public static int binary(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
           int  mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;

            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,9,11};
        int key=2;
        int binar=binary(arr, key);
        System.out.println(binar);
        
    }
    
}
