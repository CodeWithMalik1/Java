public class exercise {
    public static void count(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == key) {
                    count++;
                }

            }

        }
        System.out.println(key + " is " + count + " in the matrix");
    }

    public static void secondrowsum(int matrix[][]) {
        int sum = 0;

        for (int j = 0; j < matrix[0].length; j++) {

            sum += matrix[1][j];
        }

        System.out.println("sum of second row is " + sum);

    }
    public static void  transpose(int matrix[][]){
        int transpose[][]=new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               transpose[j][i]=matrix[i][j];

                
                
            }
           
        }
        print(transpose);

    }
    public static void print(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
        }
      
    }

    

    public static void main(String[] args) {
        int matrix[][] = {
                { 4, 7, 8 },
                { 8, 8, 8 }
        };
        int key = 7;
        count(matrix, key);
        secondrowsum(matrix);
        transpose(matrix);
        
    }

}
