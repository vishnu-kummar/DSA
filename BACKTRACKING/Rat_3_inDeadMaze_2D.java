package BACKTRACKING;
// oly left, rigjt --> technicaly no backtracking required then, only recursion
public class Rat_3_inDeadMaze_2D {
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
              if(sr>er || sc > ec) return;
              if(sr==er && sc==ec){
                System.out.println(str);
                return;
              }
              if(maze[sr][sc]==0) return;
              // go down
              printPath(sr+1, sc, er, ec, str+"D",maze);
              // go right
              printPath(sr, sc+1, er, ec, str+"R",maze);
    }
}
