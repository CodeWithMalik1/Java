public class QuickSort {

    public static void QuickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //last element
        int Partitionindex=Partition(arr,si,ei);
        QuickSort(arr, si, Partitionindex-1);//left partition
        QuickSort(arr, Partitionindex+1, ei);//right partition

    }
    public static int Partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;//it used make spaces smaller values than pivot
        for (int j = si; j < ei; j++) {
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            
        }
        //to put pivot at correct place
        i++;
         //swap
         int temp=pivot;
         arr[ei]=arr[i];
         arr[i]=temp;
         return i;


    }

    // To print sorted array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={4,8,3,6,9,7,5};
        QuickSort(arr, 0,arr.length-1);
        printArr(arr);
        
    }
    
}
