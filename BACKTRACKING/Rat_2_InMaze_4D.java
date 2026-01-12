package BACKTRACKING;
// print only unique direction
public class Rat_2_InMaze_4D {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        boolean[][] isVisted = new boolean[rows][columns];  // by deault --> false
        printPath(0,0,rows-1,columns-1,"",isVisted);
    }

    private static void printPath(int sr, int sc, int er, int ec, String str,boolean[][] isVisted) {

            if(sr<0 || sc < 0) return;
            if(sr>er || sc > ec) return;

            if(isVisted[sr][sc]==true) return;
           
            if(sr==er && sc==ec){
                System.out.println(str);
                return;
            }

            isVisted[sr][sc] = true;

            // down
            printPath(sr+1, sc, er, ec, str+"D",isVisted);
            //right
            printPath(sr, sc+1, er, ec, str+"R",isVisted);
            // up
            printPath(sr-1, sc, er, ec, str+"U",isVisted);
            // left
            printPath(sr, sc-1, er, ec, str+"L",isVisted);

            // backtracking --> jb saari call lg gyi [down,right,up,left] -> toh backtracking[true ko false banao] -> kyuki ab doosre
            // path pr v call laga sake iske liye F ko T krna jruri hai.
            isVisted[sr][sc] = false;
    }
}
/*

--> isme hum Left,right,up,down saare direction me move kr paaenge
--> pr problem ye hai ki wo infinte loop me fas sakta hai kyuki ab use piche jaane ka v access hai,
    toh hume kya karna hoga --> hume ek flag/boolean/checkmark lagana hoga ki hum yaha pr aa chuke hai,
    ab dobara is raaste pr nhi aana hai.[jis v raaste se hujrenge waha pr true krte jaaenge ki yaha pr aa chuke hai.]

    __1___2__3_
    1| T|  |  |
    2|  | T|  |
    3|  |  |  |

 --> jaise above matrix me hum {2,2} pr the ab hamare pass 4  rasste hai [up(1,2)/right(2,3)/down(3,2)/left(2,1)] --> 
     pr hum chahe ki dobara (1,1) pr jaaye toh ye possible nhi hoga kyuki hum (1,1) pr already ja chuke the aur abhi waha
     pr True mark ho chuka hai.[iske liye hum extra space jo ki 2D array hai usse use karenge]    
   
*/
