



package LECTURE15;

public class findWay {
    public static void main(String[] args) {
        char[][] Path = {
                {' ', ' ', ' ', ' '},
                {' ', ' ', 'X', ' '},
                {' ', ' ', ' ', ' '},
                {' ', 'X', 'X', ' '} 
        };

        Find("", 0, 0, 3, 3, Path);
    }

    // ans: The string representing the path taken so far (e.g., "->|D").
    public static void Find(String ans, int cc, int cr, int dc, int dr, char path[][]) {

        if (cr < 0 || cr >= path.length || cc < 0 || cc >= path[0].length) return;

        if (path[cr][cc] == 'X') return;

        if (cc > dc || cr > dr) return;
        
        if (cc == dc && cr == dr) {
            System.out.println(ans);
            return;
        }

        Find(ans + "->", cc + 1, cr, dc, dr, path);   // Increment only current column (cc + 1), as we can't move back.

        Find(ans + "|", cc, cr + 1, dc, dr, path);  // increment current row (cr + 1).
        
        Find(ans + "D", cc + 1, cr + 1, dc, dr, path);  // // Increment both current column (cc + 1) and current row (cr + 1)
        
    }
}