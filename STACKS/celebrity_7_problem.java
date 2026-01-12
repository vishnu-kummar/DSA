package STACKS;
import java.util.Stack;
/*
A celebrity is a person who is known to all but doesn't know anyone at a party.If you go to a party of N people,find if there
is a celebrity in the party or not. A square N*N matrix M[][] is used to represent people at party.
condition:- 2 conditions are there- celeb ko kisi ko nhi jaane, jaise here, in row 1 - all are zeroes. Also 1 is present in row 0 & 2.
Also, time complexity should be O(n) -> but how: there are n*n element. we can achieve using stack.
__0_1_2_
0|0|1|0|
1|0|0|0|   Here only 1 is celebrity. NOTE:- can't have more than 1 celebrity..
2|0|1|0|

*/
public class celebrity_7_problem {
    public static void main(String[] args) {
        


    }
    public static int celebrity(int[][] M,int n){
            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < n; i++) {
                st.push(i);
            }

            while (st.size()>1) {
                int v1 = st.pop();
                int v2 = st.pop();

                if( M[v1][v2] == 0){ // sayad v1 celebrity ho sakti[kyuki v1,v2 ko nhi janta] hai pr v2 celelbriy nhi hai coz 1 banda use ni jaanta
                    st.push(v1);
                }
                else if(M[v2][v1] == 0){ // sayad v2 celeb ho sakti[kyuki v2,v1 ko nhi janta] hai pr v1 celelbriy nhi hai coz 1 banda use ni jaanta
                    st.push(v2);
                }
            }
/*
__0_1_
0|0|1|   while ka, if aur else if dono condition tabhi fail hoga jb condition kuch is trah ka ho, tb niche wale if else condition chalega,
1|1|0|   yani ki dono me 1 hi ho i.e. dono ek doosre ko jaante ho.

*/          if(st.size()==0) return -1;
            int potential = st.pop();

            // niche wale do loop check karenge ki kya potential number celebrity  hai. aur agar dono loop fail hue toh potential celebrity hai.

            for (int i = 0; i < n; i++) {  // row traversal -> agr potential kisi ko janta hai
                if(M[potential][i] == 1) return -1;
            }

            for (int i = 0; i < n; i++) { // column traversal , 
                if(i==potential) continue;
                if(M[i][potential] == 0) return -1;   
            }

            return potential;
    }
}
