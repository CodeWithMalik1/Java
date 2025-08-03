class Ratemaze{
    public static void printSol(int sol[][]){
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" "+sol[i][j]+" ");
            }
            System.out.println();
            
        }
    }
     public static boolean isSafe(int maze[][],int x,int y){
        return(
            x>=0 && x<maze.length && y>=0 && y< maze.length && maze[x][y]==1
        );
     }
        public static boolean solvemaze(int maze[][]){
            int n=maze.length;
            int sol[][]=new int[n][n];
            if(mazeutili(maze, 0, 0, sol)==false) {
                System.out.println("No solution exists");
                return false;
            }
            printSol(sol);
            return true;

        }
        public static boolean mazeutili(int maze[][],int x,int y,int sol[][]){
            if(x==maze.length-1 && y==maze.length-1 && maze[x][y]==1){
                sol[x][y]=1;
                return true;
            }
            if(isSafe(maze,x,y)){
                if(sol[x][y]==1) return false;
                sol[x][y]=1;
                // Move right
                if(mazeutili(maze, x, y+1, sol)) return true;
                // Move down
                if(mazeutili(maze, x+1, y, sol)) return true;
                sol[x][y]=0;
                return false;
            }
            return false;
        }
    public static void main(String[] args) {
        int maze[][]={
            {1,1,1,1},
            {0,1,0,1},
            {1,0,1,1},
            {0,0,1,1}
        };
        solvemaze(maze);
        
    }
}