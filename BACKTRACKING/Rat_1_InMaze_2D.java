package BACKTRACKING;

// --> isme sirf recurasion ka use hua hai as it is [2 direction] --> backtracking ka use 4D me hoga

public class Rat_1_InMaze_2D {
    public static void main(String[] args) {
        int rows = 1;
        int column = 2;
        int count = maze(0,0,rows,column);
        System.out.println(count);

        //----------PRINT---DIRECTION---------

        printPath(0,0,rows,column," ");
        
    }


    private static int maze(int sr, int sc, int er, int ec) {
       if(sr>er || sc > ec) return 0;
       if(sr==er && sc==ec) return 1;

       int down = maze(sr+1, sc, er, ec);
       int right = maze(sr, sc+1, er, ec);
       int total = down+right;
       return total;
    }

//----------------------------  pRINT---PATH-------------------


       private static void printPath(int sr, int sc, int er, int ec,String str) {
              if(sr>er || sc > ec) return;
              if(sr==er && sc==ec){
                System.out.println(str);
                return;
              }
              // go down
              printPath(sr+1, sc, er, ec, str+"D");
              // go right
              printPath(sr, sc+1, er, ec, str+"R");
    }



}

/*
-------------FOR--TWO---DIRECTION--------
_________
|* |  |  |      RRD, RDR, DRR [3 ways]
|  |  | *|    


either left or right [piche nhi ja skte dobara]
*/