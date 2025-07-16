package LECTURE15;

public class ratInDeadMaze {
    public static void main(String[] args) {
        int r=3;
        int c=3;
        int[][] maze={  {1,0,1},
                        {1,1,1},
                        {1,1,0}
                       
        };

        find("",0,0,r-1,c-1,maze);
    }

    private static void find(String str, int cr, int cc, int dr, int dc, int[][] maze) {
     if(cr < 0 || cc <0) return;

if(cr> dr || cc > dc) return;


if(cr==dr  && cc==dc){

    System.out.println(str);
    return;
}

if(maze[cr][cc]==0) return;

find(str+"R", cr, cc+1, dr, dc, maze);

find(str+"D", cr+1, cc, dr, dc, maze);
    }
    
}
