class Sudoko{
    public static boolean isSafe(int sudoko[][], int row, int col, int digit) {
        for (int i = 0; i < 9; i++) {
            if (sudoko[i][col] == digit) return false;
        }
        for (int j = 0; j < 9; j++) {
            if (sudoko[row][j] == digit) return false;
        }
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoko[i][j] == digit) return false;
            }
        }
        return true;
    }
    public static boolean solveSudoko(int sudoko[][],int row,int col){
        if(row==9){
            return true;
        }
        int nextRow=row,nextcol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextcol=0;

        }
        if(sudoko[row][col]!=0){
            return solveSudoko(sudoko, nextRow, nextcol);
        }
      for(int digit=1;digit<=9;digit++){
        if(isSafe(sudoko,row,col,digit)){
          sudoko[row][col]=digit;
          if(solveSudoko(sudoko, nextRow, nextcol)){
            return true;
          }
          sudoko[row][col]=0;
        }

      }
      return false;
    }
    public static void printSudoko(int sudoko[][],int row,int col){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoko[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoko[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        if (solveSudoko(sudoko, 0, 0)) {
            System.out.println("Solution exists : ");
            printSudoko(sudoko, 0, 0);
        } else {
            System.out.println("no solution exists");
        }
    }
}