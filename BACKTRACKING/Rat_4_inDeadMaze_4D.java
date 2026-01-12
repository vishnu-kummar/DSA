package BACKTRACKING;
// since it is for 4 D --> here comes backtracking
// pr kyuki humne ek nya array use kiya S.C --> almost O(n*n)
public class Rat_4_inDeadMaze_4D {
    public static void main(String[] args) {
         int rows = 4;
        int column = 6;
        boolean[][] isVisted = new boolean[rows][column];
        int[][] maze = {
            {1,0,1,1,1,1},
            {1,1,1,1,0,1},
            {0,1,1,1,1,1},    
            {0,0,1,0,1,1}
        };
         printPath(0,0,rows-1,column-1," ",maze,isVisted);
    
    }
     private static void printPath(int sr, int sc, int er, int ec,String str,int[][] maze,boolean[][] isVisted) {
              if(sr < 0 || sc < 0) return;
              if(sr>er || sc > ec) return;

               if(isVisted[sr][sc]==true) return;

              if(sr==er && sc==ec){
                System.out.println(str);
                return;
              }
              if(maze[sr][sc]==0) return;
              isVisted[sr][sc] = true;

            // down
            printPath(sr+1, sc, er, ec, str+"D",maze,isVisted);
            //right
            printPath(sr, sc+1, er, ec, str+"R",maze,isVisted);
            // up
            printPath(sr-1, sc, er, ec, str+"U",maze,isVisted);
            // left
            printPath(sr, sc-1, er, ec, str+"L",maze,isVisted);

            // backtracking --> jb saari call lg gyi [down,right,up,left] -> toh backtracking[true ko false banao] -> kyuki ab doosre
            // path pr v call laga sake iske liye F ko T krna jruri hai.
            isVisted[sr][sc] = false;
    }
}
