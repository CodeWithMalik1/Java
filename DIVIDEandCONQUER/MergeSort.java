public class MergeSort {
    public static void printMerge(int arr[], int startIndex, int endIndex) {
        // Base case
        if (startIndex >= endIndex) {
            return;
        }
        // Divide and conquer
        int mid = startIndex + (endIndex - startIndex) / 2;

        // Recursive calls
        printMerge(arr, startIndex, mid);
        printMerge(arr, mid + 1, endIndex);

        // Merge the sorted halves
        merge(arr, startIndex, mid, endIndex);
    }

    public static void merge(int arr[], int startIndex, int mid, int endIndex) {
        // Temporary array to hold merged results
        int temp[] = new int[endIndex - startIndex + 1];
        int i = startIndex;  // Iterator for left part
        int j = mid + 1;     // Iterator for right part
        int k = 0;           // Iterator for temp array

        // Merge elements in sorted order
        while (i <= mid && j <= endIndex) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Left part remaining
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Right part remaining
        while (j <= endIndex) {
            temp[k++] = arr[j++];
        }

        // Copy temp to original array
        for (int k1 = 0, i1 = startIndex; k1 < temp.length; k1++, i1++) {
            arr[i1] = temp[k1];
        }
    }

    // To print sorted array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8,-2};
        printMerge(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
