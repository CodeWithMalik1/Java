import java.util.Arrays;

public class MinAbsoluteDifference {
    public static void printAbsDifference(int A[],int B[]){
        Arrays.sort(A);
        Arrays.sort(B);
        int MinAbsoluteDifference=0;
        for (int i = 0; i < A.length; i++) {
            MinAbsoluteDifference+=Math.abs(A[i]-B[i]);
            
        }
        System.out.println(MinAbsoluteDifference);
    } 
    
    public static void main(String[] args) {
        int A[]={1,2,45,67,8};
        int B[]={3,78,65,98,77};
        printAbsDifference(A, B);

    }
}
