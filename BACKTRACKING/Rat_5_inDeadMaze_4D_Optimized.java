package BACKTRACKING;
// without using extra space[2D array or true/false] 
public class Rat_5_inDeadMaze_4D_Optimized {
    public static void main(String[] args) {
        
       int rows = 4;
        int column = 6;
        
        int[][] maze = {
            {1,0,1,1,1,1},
            {1,1,1,1,0,1},
            {0,1,1,1,1,1},    
            {0,0,1,0,1,1}
        };
         printPath(0,0,rows-1,column-1," ",maze);
    
    }
     private static void printPath(int sr, int sc, int er, int ec,String str,int[][] maze) {
              if(sr < 0 || sc < 0) return;
              if(sr>er || sc > ec) return;

               if(maze[sr][sc]==-1) return;

              if(sr==er && sc==ec){
                System.out.println(str);
                return;
              }
              if(maze[sr][sc]==0) return;
              maze[sr][sc] = -1;

            // down
            printPath(sr+1, sc, er, ec, str+"D",maze);
            //right
            printPath(sr, sc+1, er, ec, str+"R",maze);
            // up
            printPath(sr-1, sc, er, ec, str+"U",maze);
            // left
            printPath(sr, sc-1, er, ec, str+"L",maze);

            // backtracking --> jb saari call lg gyi [down,right,up,left] -> toh backtracking[true ko false banao] -> kyuki ab doosre
            // path pr v call laga sake iske liye F ko T krna jruri hai.
            maze[sr][sc] = 1;
    }
}
