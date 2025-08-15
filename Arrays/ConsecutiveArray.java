public class ConsecutiveArray {
    public static void sortArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }
    public static void consArr(int arr[]){
        int c=1;
        for (int i = 0; i < arr.length-1; i++) {
            if((arr[i+1]-arr[i])==1) c++;
            else break;
            
        }
        System.out.println(c);
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,6,7,2,5,3,4,8,9,10};
        sortArr(arr);
        printArr(arr);
        consArr(arr);
        

    }
    
}
