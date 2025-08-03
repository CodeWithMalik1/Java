public class spiralmatrix {
    public static void spiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;


        while (startRow<=endRow && startCol<=endCol) {
            //top
            for (int i = startCol; i <=endCol; i++) {
                System.out.print(matrix[startRow][i]+" ");
                
            }
            //right
            
                for (int j = startRow+1; j <=endRow; j++) {
                    System.out.print(matrix[j][endCol]+" ");
                    
                }

                // //bottom
                // for (int i = endCol-1; i >=startCol; i--) {
                   
                //     //for odd matrix
                //     if(startCol==endCol){
                //         return;
                //     }
                //     System.out.print(matrix[endRow][i]+" ");
                    
                // }

                // //left
                
                // for (int j = endRow-1; j >=startRow+1; j--) 
                // {System.out.print(matrix[j][startCol]+" ");
                    
                // }

                //for 3 *4 matrix to avoid duplicate
                 // Bottom row (check to avoid duplicate printing)
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    System.out.print(matrix[endRow][i] + " ");
                }
            }

            // Left column (check to avoid duplicate printing)
            if (startCol < endCol) {
                for (int j = endRow - 1; j > startRow; j--) {
                    System.out.print(matrix[j][startCol] + " ");
                }
                startCol++;
                endCol--;
                startRow++;
                endRow--;
            
        }
        

    }
    System.out.println();
        
}

    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        spiral(matrix);
    }
    
}
