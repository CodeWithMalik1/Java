public class SortedAndRotated {
    public static int search (int arr[],int target,int si,int ei){
        int mid=si+(ei-si)/2;
        //case found
        if (arr[mid]==target) {
            return mid;
            
        }  
        
        //mid on Line1
        if(arr[si]<=arr[mid]){
            //case a:left
            if (arr[si]<=target && target<=arr[mid]) {
                return search(arr, target, si, mid-1);
                
            }
            //case b:right
            else{
                return search(arr, target, mid+1, ei);
            }

        }
        //mid on line 2
        else{
            //case c:right
            if(arr[mid]<=target&& target<=arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            //case d:left
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int print=search(arr, target, 0, arr.length-1);
        System.out.println(print);
        
    }
    
}
