package HASHMAP.HASHSET;
import java.util.HashSet;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(check(arr));
    }

    private static int check(int[] arr) {

          HashSet<Integer> st = new HashSet<>();
          for(int i : arr) st.add(i);

int maxSteak = 0;

          for(int i : st){
              if(!st.contains(i-1)){
                int currNum = i;
                int currStreak = 1;
                while (st.contains(currNum + 1)) {
                  currStreak++;
                  currNum++;
                }
                maxSteak =  Math.max(maxSteak, currStreak);
              }
             
          }
          return maxSteak;
    }
}

/*
since there is loop i.e while inside loop i.e for. so one would think that time complxity would be n square. but it's not true,
it is still linear how -> kyuki while loop me hum tbhi enter kr raqhe hai jb kisi number ka [num + 1] value mil raha hai. agr nhi mila toh hum
loop me jaa hi nhi rahe hai. jasie 1 ke bad 2,3,4 in that case we enter into inner loop but when num is 200 we didin't enter because there
is not 201.Also hum kisi umber ko maximum 2 hi baar traverse kr rahe hai, agr duplicate hote us case me traverse 2 se jyada ho skta tha, aur time complexity
increase v ho skti thi. pr set em dublicate ho hi nhi skte.
*/

/*

eg: arr = {100,4,200,1,3,2};
  1234 --> 4,  100 --> 1,  200 --> 1   answer is 4

eg : {0,3,7,2,5,8,4,6,0,1};
    output: 9

*/
