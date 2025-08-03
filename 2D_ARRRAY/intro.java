import java.util.Scanner;

public class intro{
    public static boolean found(int arr[][],int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                // if(arr[i][i]==key){
                //     System.out.println(key +"key found at index arr("+ i+","+j+")");
                //     return true;
                // }
                if (arr[i][j] == key) {
                    System.out.println(key + " key found at index arr(" + i + "," + j + ")");
                    return true;
                }
                
                
            }
            
        }
        System.out.println(key +"key not found");
        return false;

    }
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
     
        int n=arr.length,m=arr[0].length;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //input
                arr[i][j]=sc.nextInt();

                
            }
            
        }
        //print output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //input
                System.out.print(arr[i][j]+" ");

                
            }
            System.out.println();
            
        }
        found(arr, 4);

        
    }
}